package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Contribute implements Serializable {
    private Integer contributeId;

    private Integer uid;

    private String msg;

    private String theme;

    private String customer_name;

    private String customer_phone;

    private String customer_email;

    private Integer isDelete;
}
