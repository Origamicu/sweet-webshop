package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SuperAccount implements Serializable {
    private Integer superId;

    private String username;

    private String password;

    private Integer status;
}
