package com.github.fabriciolfj.product.domain.exceptions;

public class ProductCreateException extends RuntimeException {

    public ProductCreateException(final String msg) {
        super(msg);
    }
}
