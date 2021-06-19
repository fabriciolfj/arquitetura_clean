package com.github.fabriciolfj.product.infrastructure.springcontroller;

import com.github.fabriciolfj.product.domain.exceptions.ProductCreateException;
import com.github.fabriciolfj.product.interfaceadapter.controller.ProductControllerAdapter;
import com.github.fabriciolfj.product.interfaceadapter.controller.model.RequestProduct;
import com.github.fabriciolfj.product.interfaceadapter.controller.model.ResponseProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductControllerAdapter adapter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseProduct process(@RequestBody final RequestProduct request) {
        return adapter.processCreated(request);
    }

    @ExceptionHandler(ProductCreateException.class)
    public ResponseEntity productCreateException(final ProductCreateException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
