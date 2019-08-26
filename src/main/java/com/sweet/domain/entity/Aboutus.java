package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Aboutus implements Serializable {
    private Integer aboutusId;

    private String title;

    private String image;

    private String introduction;
}
