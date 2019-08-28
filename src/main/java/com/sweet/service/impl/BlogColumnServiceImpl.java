package com.sweet.service.impl;

import com.sweet.domain.entity.Blog;
import com.sweet.domain.entity.BlogSort;
import com.sweet.domain.entity.StayMsg;
import com.sweet.domain.vo.StayMsgVo;
import com.sweet.mapper.BlogMapper;
import com.sweet.mapper.BlogSortMapper;
import com.sweet.mapper.StayMsgMapper;
import com.sweet.service.BlogColumnService;
import com.sweet.utils.BlogKeyword;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.sweet.utils.Constants.BLOG_KEYWORD;

@Service("blogColumnService")
public class BlogColumnServiceImpl implements BlogColumnService {
    @Resource
    BlogMapper blogMapper;
    @Resource
    BlogKeyword blogKeyword;
    @Resource
    BlogSortMapper blogSortMapper;
    @Resource
    StayMsgMapper stayMsgMapper;

    /**
     * blog Standard 页面博客展示查询
     */
    @Override
    public List<Blog> findAll(int page, int size) {
        page = (page - 1) * 9;
        return blogMapper.findAll(page,size);
    }

    /**
     * 博客最新榜3条数据
     * @return
     */
    @Override
    public List<Blog> findNew() {
        return blogMapper.findNew();
    }

    /**
     * 统计分类博客总数
     * @return
     */
    @Override
    public List<BlogKeyword> CountKeyword() {
        List<BlogKeyword> list = new ArrayList<>();
        for (String keyword : BLOG_KEYWORD) {
            String s = blogMapper.CountkeyWord(keyword).toString();
            blogKeyword.setKeyword(keyword);
            blogKeyword.setNumber(s);
            list.add(blogKeyword);
        }
        return list;
    }



    /**
     * 查询所有标签
     */
    @Override
    public List<BlogSort> findAllSort() {
        return blogSortMapper.findAllSort();
    }

    /**
     * 通过博客id查询评论
     * @param blogId
     * @return
     */
    @Override
    public List<StayMsgVo> findStayMsgByBlogId(int blogId) {
       return stayMsgMapper.findByblogId(blogId);
    }
}
