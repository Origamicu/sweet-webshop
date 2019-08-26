package com.sweet.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class AboutusMsg implements Serializable {
    private Integer aboutusMsgId;

    private Integer aboutusId;

    private String mainMsg;

    private String teamMsg;

    private String chatMsg;

    private String allMsg;

    private String expectMsg;
}
