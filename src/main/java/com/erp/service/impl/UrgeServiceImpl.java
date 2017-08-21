package com.erp.service.impl;


import com.erp.mapper.UrgeMapper;
import com.erp.model.Urge;
import com.erp.service.UrgeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("urgeService")
@Transactional
public class UrgeServiceImpl implements UrgeService
{
    @Autowired
    private UrgeMapper urgeMapper;

    @Override
    public List<Urge> getList(Urge urge)
    {
        return urgeMapper.select(urge);
    }

    @Override
    public Urge getUrgeById(Integer id)
    {
        return urgeMapper.selectByPrimaryKey(id);
    }
}