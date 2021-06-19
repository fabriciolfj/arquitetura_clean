package com.github.fabriciolfj.product.interfaceadapter.repository.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "product")
@Entity
@Getter
@Setter
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String code;
}
