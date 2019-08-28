package com.sweet.domain.vo;

import com.sweet.domain.entity.StayMsg;
import com.sweet.domain.entity.User;
import lombok.Data;

@Data
public class StayMsgVo  extends StayMsg {
    User user;
}
