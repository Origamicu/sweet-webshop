package com.sweet.mapper;

import com.sweet.domain.Vo.AboutusVo;
import com.sweet.domain.entity.Aboutus;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AboutusMapper {

    AboutusVo findById(@Param("aboutusId") int aboutusId);

//    List<Aboutus> findAll();

}
