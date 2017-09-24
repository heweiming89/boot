/**
 * 
 */
package io.heweiming.boot.service.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.heweiming.boot.service.constant.ConfigConstant;

/**
 * @author heweiming 2017年9月24日 上午3:57:36
 * @version 1.0.0
 * @description
 */
@EnableJpaRepositories(basePackages = { ConfigConstant.REPOSITORY_BASE_PACKAGES })
@EntityScan(basePackages = { ConfigConstant.ENTITY_BASE_PACKAGES })
public class JPAConfig {

}
