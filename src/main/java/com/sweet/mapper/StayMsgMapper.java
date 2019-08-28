package com.sweet.mapper;

import com.sweet.domain.vo.StayMsgVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StayMsgMapper {
    List<StayMsgVo> findByblogId(@Param("blogId") int blogId);
}
