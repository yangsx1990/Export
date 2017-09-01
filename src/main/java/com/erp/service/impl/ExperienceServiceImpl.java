package com.erp.service.impl;

import com.erp.mapper.ExperienceMapper;
import com.erp.model.Experience;
import com.erp.service.ExperienceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("experienceService")
@Transactional
public class ExperienceServiceImpl implements ExperienceService
{
    @Autowired
    private ExperienceMapper experienceMapper;

    @Override
    public List<Experience> getList(Experience experience)
    {
        Example example=new Example(Experience.class);
        example.createCriteria().andEqualTo("studentNo",experience.getStudentNo());
        example.orderBy("sort").desc();
        return experienceMapper.selectByExample(example);
    }



    @Override
    public Experience getExperienceById(Integer id)
    {
        return experienceMapper.selectByPrimaryKey(id);
    }
}