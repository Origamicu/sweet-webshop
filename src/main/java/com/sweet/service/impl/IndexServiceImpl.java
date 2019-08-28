package com.sweet.service.impl;


import com.sweet.domain.Vo.AboutusVo;
import com.sweet.domain.Vo.CategoryVo;
import com.sweet.domain.Vo.ProduceVo;
import com.sweet.domain.entity.Banner;
import com.sweet.domain.entity.Blog;
import com.sweet.mapper.AboutusMapper;
import com.sweet.mapper.BannerMapper;
import com.sweet.mapper.BlogMapper;
import com.sweet.mapper.CategoryMapper;
import com.sweet.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    AboutusMapper aboutusMapper;
    @Resource
    CategoryMapper categoryMapper;
    @Resource
    BlogMapper blogMapper;
    @Resource
    BannerMapper bannerMapper;

    @Override
    public AboutusVo getAboutus(int aboutusId) {
        return aboutusMapper.findById(aboutusId);
    }

    @Override
    public List<CategoryVo> getMenu() {
        return categoryMapper.findAll();
    }

    @Override
    public List<Blog> getNewBlogs() {
        return blogMapper.findNewBlogs();
    }

    @Override
    public List<Banner> getBannerImages() {
        return bannerMapper.findAll();
    }


}
