package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Property implements Serializable {
    private Integer propertyId;

    private Integer produceId;

    private String produceName;
}
