package com.sweet.domain.Vo;

import com.sweet.domain.entity.Aboutus;
import com.sweet.domain.entity.AboutusMsg;
import lombok.Data;

import java.util.List;

@Data
public class AboutusVo extends Aboutus {

    List<AboutusMsg> aboutusMsgs;
}
