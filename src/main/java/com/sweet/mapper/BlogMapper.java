package com.sweet.mapper;

import com.sweet.domain.entity.Blog;

import java.util.List;

public interface BlogMapper {

    List<Blog> findNewBlogs();
}
