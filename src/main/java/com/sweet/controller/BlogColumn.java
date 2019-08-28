package com.sweet.controller;


import com.sweet.domain.entity.Blog;
import com.sweet.domain.entity.BlogSort;
import com.sweet.domain.vo.StayMsgVo;
import com.sweet.service.BlogColumnService;
import com.sweet.utils.BlogKeyword;
import com.sweet.utils.BlogTotal;
import com.sweet.utils.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogColumn {
    @Resource
    BlogColumnService blogColumnService;

    /**
     * blog standard 页面展示
     * (page+1) * size
     * http://localhost:8080/blog/list/1/10
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

    @RequestMapping("/newblog")
    public Result blogNew(){
        List<Blog> aNew = blogColumnService.findNew();
        try{
            return Result.success(aNew);
        }catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * http://localhost:8080/blog/keyword
     * @return
     */
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
     * http://localhost:8080/blog/staymsg?blogId=1
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

    /**
     * http://localhost:8080/blog/countblog?size=4
     * 博客总数 和 分页总数
     * @return
     */
    @RequestMapping("/countblog")
    public Result blogTotal(int size) {
        BlogTotal blogTotal = blogColumnService.countBlog(size);
        try{
            return Result.success(blogTotal);
        }catch (Exception e) {
            return Result.error();
        }
    }
}
