package com.erp.service.impl;

import com.erp.mapper.OperatorMapper;
import com.erp.model.Operator;
import com.erp.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("operatorService")
@Transactional
public class OperatorServiceImpl implements OperatorService
{
    @Autowired
    private OperatorMapper operatorMapper;

    @Override
    public List<Operator> getList(Operator operator)
    {
        return operatorMapper.select(operator);
    }

    @Override
    public Operator getOperatorById(Integer id)
    {
        return operatorMapper.selectByPrimaryKey(id);
    }
}