package com.sweet.controller;


import com.sweet.domain.entity.Blog;
import com.sweet.domain.entity.BlogSort;
import com.sweet.domain.vo.StayMsgVo;
import com.sweet.service.BlogColumnService;
import com.sweet.utils.BlogKeyword;
import com.sweet.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/blog")
public class BlogColumn {
    @Resource
    BlogColumnService blogColumnService;

    /**
     * blog standard 页面展示
     * (page+1) * size
     * http://localhost:8080/blog/standard/1/10
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/list/{page}/{size}")
    public Result blogList(@PathVariable("page") int page,@PathVariable("size") int size) {
        List<Blog> blogs = blogColumnService.findAll(page, size);
        try{
            return Result.success(blogs);
        }catch (Exception e) {
            return Result.error();
        }
    }

    @RequestMapping("/newBlog")
    public Result blogNew(){
        List<Blog> aNew = blogColumnService.findNew();
        try{
            return Result.success(aNew);
        }catch (Exception e) {
            return Result.error();
        }
    }

    @RequestMapping("/keyword")
    public Result blogCount(){
        List<BlogKeyword> keywords = blogColumnService.CountKeyword();
        try{
            return Result.success(keywords);
        }catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 标签栏
     * @return
     */
    @RequestMapping("/sort")
    public Result blogSort() {
        List<BlogSort> sort = blogColumnService.findAllSort();
        try{
            return Result.success(sort);
        }catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 博客的相关评论
     */
    @RequestMapping("/staymsg")
    public Result blogStayMsg(int blogId) {
        List<StayMsgVo> stayMsgs = blogColumnService.findStayMsgByBlogId(blogId);
        try{
            return Result.success(stayMsgs);
        }catch (Exception e) {
            return Result.error();
        }
    }
}
