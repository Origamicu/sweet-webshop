package com.sweet.service;

import com.sweet.domain.entity.Blog;
import com.sweet.domain.entity.BlogSort;
import com.sweet.domain.vo.StayMsgVo;
import com.sweet.utils.BlogKeyword;

import java.util.List;

public interface BlogColumnService {
    List<Blog> findAll(int page,int size);
    List<Blog> findNew();
    List<BlogKeyword> CountKeyword();
    List<BlogSort> findAllSort();
    List<StayMsgVo> findStayMsgByBlogId(int blogId);
}
