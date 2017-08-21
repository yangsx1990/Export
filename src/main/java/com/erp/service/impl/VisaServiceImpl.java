package com.erp.service.impl;

import com.erp.mapper.VisaMapper;
import com.erp.model.Visa;
import com.erp.service.VisaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("visaService")
@Transactional
public class VisaServiceImpl implements VisaService
{
    @Autowired
    private VisaMapper visaMapper;

    @Override
    public List<Visa> getList(Visa visa)
    {
        return visaMapper.select(visa);
    }


    @Override
    public Visa getVisaById(Integer id)
    {
        return visaMapper.selectByPrimaryKey(id);
    }
}