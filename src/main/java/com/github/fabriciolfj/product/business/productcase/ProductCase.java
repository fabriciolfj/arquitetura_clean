package com.github.fabriciolfj.product.business.productcase;

import com.github.fabriciolfj.product.business.SaveProduct;
import com.github.fabriciolfj.product.domain.Product;
import com.github.fabriciolfj.product.domain.exceptions.ProductCreateException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductCase {

    private final SaveProduct saveProduct;

    public Product create(final Product product) {
        try {
            saveProduct.save(product.generatedCode());
            return product;
        } catch (Exception e) {
            throw new ProductCreateException("Fail created product. Detalhes: " + e.getMessage());
        }

    }
}
