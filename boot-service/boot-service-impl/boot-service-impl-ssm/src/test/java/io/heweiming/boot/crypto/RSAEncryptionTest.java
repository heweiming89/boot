package io.heweiming.boot.crypto;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.junit.Test;

import io.heweiming.boot.encryption.RSAEncryption;

public class RSAEncryptionTest {

    @Test
    public void test() throws NoSuchAlgorithmException {
        KeyPair keyPair = RSAEncryption.genKeyPair(1024);
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        System.out.println(RSAEncryption.base64Key(publicKey));
        System.out.println();
        System.out.println(RSAEncryption.base64Key(privateKey));
    }

}
