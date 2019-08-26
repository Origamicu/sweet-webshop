package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Category implements Serializable {
    private Integer categoryId;

    private String name;
}
