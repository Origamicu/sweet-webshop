package com.sweet.service;


import com.sweet.domain.Vo.AboutusVo;
import com.sweet.domain.Vo.CategoryVo;
import com.sweet.domain.entity.Banner;
import com.sweet.domain.entity.Blog;

import java.util.List;

public interface IndexService {

    AboutusVo getAboutus(int aboutusId);

    List<CategoryVo> getMenu();

    List<Blog> getNewBlogs();

    List<Banner> getBannerImages();
}
