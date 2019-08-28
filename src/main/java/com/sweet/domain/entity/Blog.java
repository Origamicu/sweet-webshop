package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Blog implements Serializable {
    private Integer blogId;

    private String blogKeyword;

    private String blogDescription;

    private String blogName;

    private String blogTitle;

    private Date createTime;

    private Integer isDelete;

    private String blogImg;

    private Integer sortId;
}
