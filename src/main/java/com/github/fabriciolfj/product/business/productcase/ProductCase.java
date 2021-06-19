package com.github.fabriciolfj.product.business.productcase;

import com.github.fabriciolfj.product.business.SaveProduct;
import com.github.fabriciolfj.product.domain.Product;
import com.github.fabriciolfj.product.domain.exceptions.ProductCreateException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProductCase {

    private final SaveProduct saveProduct;

    public Product create(final Product product) {
        try {
            log.info("Product: {}", product.toString());
            saveProduct.save(product.generatedCode());
            return product;
        } catch (Exception e) {
            throw new ProductCreateException("Fail created product. Detalhes: " + e.getMessage());
        }

    }
}
