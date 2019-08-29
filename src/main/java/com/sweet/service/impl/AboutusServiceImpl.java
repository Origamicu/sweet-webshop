package com.sweet.service.impl;

import com.sweet.domain.entity.Aboutus;
import com.sweet.domain.entity.Staff;
import com.sweet.mapper.AboutusMapper;
import com.sweet.mapper.StaffMapper;
import com.sweet.service.AboutusService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("aboutusServiceImpl")
public class AboutusServiceImpl implements AboutusService {
    @Resource
    AboutusMapper aboutusMapper;
    @Resource
    StaffMapper staffMapper;

    @Override
    public List<Aboutus> getAboutusAll() {
        return aboutusMapper.findAll();
    }

    @Override
    public List<Staff> getStaffs() {
        return staffMapper.findAll();
    }
}
