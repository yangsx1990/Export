package com.erp.service.impl;

import com.erp.mapper.SupplementMapper;
import com.erp.model.Supplement;
import com.erp.service.SupplementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("supplementService")
@Transactional
public class SupplementServiceImpl implements SupplementService
{
    @Autowired
    private SupplementMapper supplementMapper;

    @Override
    public List<Supplement> getList(Supplement supplement)
    {
        return supplementMapper.select(supplement);
    }



    @Override
    public Supplement getSupplementById(Integer id)
    {
        return supplementMapper.selectByPrimaryKey(id);
    }
}