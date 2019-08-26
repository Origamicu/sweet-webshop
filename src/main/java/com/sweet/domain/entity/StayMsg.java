package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class StayMsg implements Serializable {
    private Integer stayId;

    private Integer uid;

    private Integer blogId;

    private String stayMsg;

    private Date StayTime;

    private Integer isDelete;
}
