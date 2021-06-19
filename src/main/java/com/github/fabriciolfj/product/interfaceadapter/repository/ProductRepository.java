package com.github.fabriciolfj.product.interfaceadapter.repository;

import com.github.fabriciolfj.product.interfaceadapter.repository.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
