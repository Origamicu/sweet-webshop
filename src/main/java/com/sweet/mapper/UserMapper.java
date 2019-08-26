package com.sweet.mapper;

import com.sweet.domain.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUid(@Param("uid") int uid);
}
