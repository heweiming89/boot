package io.heweiming.boot.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.UUID;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

import io.heweiming.boot.api.ApplicationAPI;
import io.heweiming.boot.properties.RSAEncryptionProperties;
import io.heweiming.boot.web.AjaxResponse;

@RestController
public class ApplicationAPIImpl implements ApplicationAPI {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(ApplicationAPIImpl.class);

    @Autowired
    private RSAEncryptionProperties encryptionProperties;

    @Override
    public AjaxResponse<String> login(String email, String password) {
        AjaxResponse<String> ajaxResponse = AjaxResponse.getInstance();
        Assert.hasText(email, "邮箱不能为空");
        Assert.hasText(password, "密码不能为空");
        try {
            RSAPublicKey publicKey = encryptionProperties.parsePublicKey();
            RSAPrivateKey privateKey = encryptionProperties.parsePrivateKey();
            Algorithm algorithm = Algorithm.RSA512(publicKey, privateKey);
            LocalDateTime now = LocalDateTime.now();
            String token = JWT.create()//
                    .withJWTId(UUID.randomUUID().toString())//
                    .withSubject(email)//
                    .withIssuer("ssm")//
                    .withAudience("admin", "user")//
                    .withIssuedAt(now.toDate())//
                    .withExpiresAt(now.plusMinutes(30).toDate())//
                    .withNotBefore(now.toDate())//
                    .sign(algorithm);
            ajaxResponse.withSuccess(true).withData(token);
            logger.info("用户 {} 成功登录", email);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | IllegalArgumentException
                | JWTCreationException e) {
            ajaxResponse.withMessage(e.getMessage());
        }
        return ajaxResponse;
    }

}
