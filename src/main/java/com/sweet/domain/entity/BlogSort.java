package com.sweet.domain.entity;

import lombok.Data;

@Data
public class BlogSort {
    private Integer sortId;

    private Integer blogId;

    private String sortName;

    private Integer isDelete;
}
