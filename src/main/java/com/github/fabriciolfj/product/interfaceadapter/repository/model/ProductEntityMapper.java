package com.github.fabriciolfj.product.interfaceadapter.repository.model;

import com.github.fabriciolfj.product.domain.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductEntityMapper {

    ProductEntityMapper INSTANCE = Mappers.getMapper(ProductEntityMapper.class);

    @Mapping(target = "code", source = "code")
    @Mapping(target = "description", source = "description")
    ProductEntity toEntity(final Product product);
}
