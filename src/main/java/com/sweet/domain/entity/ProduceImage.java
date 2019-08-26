package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProduceImage implements Serializable {
    private Integer produceImageId;

    private Integer produceId;

    private String image;

}
