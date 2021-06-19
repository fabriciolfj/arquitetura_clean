package com.github.fabriciolfj.product.interfaceadapter.controller;

import com.github.fabriciolfj.product.business.productcase.ProductCase;
import com.github.fabriciolfj.product.domain.exceptions.ProductCreateException;
import com.github.fabriciolfj.product.interfaceadapter.controller.model.ProductControllerMapper;
import com.github.fabriciolfj.product.interfaceadapter.controller.model.RequestProduct;
import com.github.fabriciolfj.product.interfaceadapter.controller.model.ResponseProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static java.util.Optional.ofNullable;

@Component
@RequiredArgsConstructor
public class ProductControllerAdapter {

    private final ProductCase productCase;

    public ResponseProduct processCreated(final RequestProduct request) {
        return ofNullable(ProductControllerMapper.INSTANCE.toDomain(request))
                .map(productCase::create)
                .map(ProductControllerMapper.INSTANCE::toResponse)
                .orElseThrow(() -> new ProductCreateException("Fail mapper product"));
    }
}
