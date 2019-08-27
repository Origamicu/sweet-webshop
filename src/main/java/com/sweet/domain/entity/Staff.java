package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Staff implements Serializable {
    private Integer staffId;

    private String name;

    private String img;

    private String character;

    private Integer status;

    private Integer aboutusId;
}
