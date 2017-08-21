package com.erp.service.impl;

import com.erp.mapper.VisitMapper;
import com.erp.model.Visit;
import com.erp.service.VisitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("visitService")
@Transactional
public class VisitServiceImpl implements VisitService
{
    @Autowired
    private VisitMapper visitMapper;

    @Override
    public List<Visit> getList(Visit visit)
    {
        return visitMapper.select(visit);
    }


    @Override
    public Visit getVisitById(Integer id)
    {
        return visitMapper.selectByPrimaryKey(id);
    }
}