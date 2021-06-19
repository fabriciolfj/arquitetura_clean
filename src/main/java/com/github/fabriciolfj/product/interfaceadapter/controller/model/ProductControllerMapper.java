package com.github.fabriciolfj.product.interfaceadapter.controller.model;

import com.github.fabriciolfj.product.domain.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductControllerMapper {

    ProductControllerMapper INSTANCE = Mappers.getMapper(ProductControllerMapper.class);

    ResponseProduct toResponse(final Product product);

    @Mapping(target = "description", source = "description")
    Product toDomain(final RequestProduct request);
}
