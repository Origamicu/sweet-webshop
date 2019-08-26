package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PropertyValue implements Serializable {
    private Integer propertyValueId;

    private Integer propertyId;

    private String propertyValueName;
}
