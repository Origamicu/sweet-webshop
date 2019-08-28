package com.sweet.mapper;

import com.sweet.domain.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {
    List<Blog> findAll(@Param("page") int page,@Param("size") int size);
    List<Blog> findNew();
    Object CountkeyWord(@Param("keyword") String keyword);
}
