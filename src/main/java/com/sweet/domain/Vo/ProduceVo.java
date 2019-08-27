package com.sweet.domain.Vo;

import com.sweet.domain.entity.Produce;
import com.sweet.domain.entity.ProduceImage;
import lombok.Data;

import java.util.List;

@Data
public class ProduceVo extends Produce {

    ProduceImage produceImage;
}
