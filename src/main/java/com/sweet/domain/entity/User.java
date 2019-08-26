package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private  Integer uid;

    private  String username;

    private String password;

    private String name;

    private String icon;

    private Date createTime;

    private Date lastLogin;

    private String email;

    private String phone;

    private String question;

    private String answer;

    private Integer status;
}
