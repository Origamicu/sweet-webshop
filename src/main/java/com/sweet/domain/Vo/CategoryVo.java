package com.sweet.domain.Vo;

import com.sweet.domain.entity.Category;
import lombok.Data;

import java.util.List;

@Data
public class CategoryVo extends Category {

    List<ProduceVo> produceVos;
}
