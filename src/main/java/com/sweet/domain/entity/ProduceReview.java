package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ProduceReview implements Serializable {
    private Integer reviewId;

    private String content;

    private Date createDate;

    private Integer produceId;

    private Integer uid;

    private Integer isDelete;

}
