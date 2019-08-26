package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Produce implements Serializable {
    private Integer produceId;

    private Integer categoryId;

    private String produceName;

    private double originalPrice;

    private double promotePrice;

    private String detail;

    private Integer produceImageId;

    private Integer stock;

    private Date createTime;


}
