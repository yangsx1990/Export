package com.erp.service.impl;

import com.erp.mapper.AfterBusinessMapper;
import com.erp.model.AfterBusiness;
import com.erp.service.AfterBusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("afterBusinessService")
@Transactional
public class AfterBusinessServiceImpl implements AfterBusinessService
{
    @Autowired
    private AfterBusinessMapper afterBusinessMapper;

    @Override
    public List<AfterBusiness> getList(AfterBusiness afterBusiness)
    {
        return afterBusinessMapper.select(afterBusiness);
    }

    @Override
    public AfterBusiness getAfterBusinessById(Integer id)
    {
        return afterBusinessMapper.selectByPrimaryKey(id);
    }
}