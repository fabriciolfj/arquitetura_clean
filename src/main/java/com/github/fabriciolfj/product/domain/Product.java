package com.github.fabriciolfj.product.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {

    private String code;
    private String description;

    public Product generatedCode() {
        this.code = UUID.randomUUID().toString();
        return this;
    }
}
