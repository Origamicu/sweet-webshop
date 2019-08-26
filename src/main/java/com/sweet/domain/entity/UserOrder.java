package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserOrder implements Serializable {
    private Integer orderId;

    private String orderAddress;

    private Date createTime;

    private Date exitDate;

    private Integer orderNum;

    private Integer userId;

    private Integer produceId;

    private Date payDate;

    private Integer status;
}
