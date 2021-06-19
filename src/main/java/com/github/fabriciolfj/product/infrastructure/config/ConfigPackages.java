package com.github.fabriciolfj.product.infrastructure.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.github.fabriciolfj.product"})
@EntityScan(basePackages = {"com.github.fabriciolfj.product.interfaceadapter.repository.model"})
@EnableJpaRepositories(basePackages = {"com.github.fabriciolfj.product.interfaceadapter.repository"})
public class ConfigPackages {
}
