package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Banner implements Serializable {

    private Integer bannerId;

    private String title;

    private String image;

    private String detailUrl;

    private Integer bannerOrder;

    private Date createTime;

    private Integer status;
}
