package com.github.fabriciolfj.product.interfaceadapter.repository.model;

import com.github.fabriciolfj.product.domain.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductEntityMapper {

    ProductEntityMapper INSTANCE = Mappers.getMapper(ProductEntityMapper.class);

    ProductEntity toEntity(final Product product);
}
