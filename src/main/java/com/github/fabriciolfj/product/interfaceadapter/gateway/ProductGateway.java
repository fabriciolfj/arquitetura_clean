package com.github.fabriciolfj.product.interfaceadapter.gateway;

import com.github.fabriciolfj.product.business.SaveProduct;
import com.github.fabriciolfj.product.domain.Product;
import com.github.fabriciolfj.product.interfaceadapter.repository.ProductRepository;
import com.github.fabriciolfj.product.interfaceadapter.repository.model.ProductEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static java.util.Optional.ofNullable;

@Component
@RequiredArgsConstructor
public class ProductGateway implements SaveProduct {

    private final ProductRepository productRepository;

    @Override
    public void save(final Product product) {
        ofNullable(ProductEntityMapper.INSTANCE.toEntity(product))
                .map(productRepository::save)
                .get();
    }
}
