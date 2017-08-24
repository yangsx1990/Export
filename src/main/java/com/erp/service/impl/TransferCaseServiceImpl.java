package com.erp.service.impl;

import com.erp.mapper.TransferCaseMapper;
import com.erp.model.TransferCase;
import com.erp.service.TransferCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Iterator;
import java.util.List;

@Service("transferCaseService")
@Transactional
public class TransferCaseServiceImpl implements TransferCaseService
{
    @Autowired
    private TransferCaseMapper transferCaseMapper;



    @Override
    public TransferCase getTransferCaseById(Integer id)
    {
        return transferCaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TransferCase> getOperator(TransferCase transferCase) {
        return transferCaseMapper.select(transferCase);
    }

    @Override
    public List<TransferCase> queryByOperatorId(List<Integer> operators, Integer countryId) {

        Example example=new Example(TransferCase.class);
        example.createCriteria().andEqualTo("countryId",countryId).andEqualTo("enableStatus",1)
        .andIn("laterOperator",operators).andEqualTo("result",1).andEqualTo("transferType",1);
        return transferCaseMapper.selectByExample(example);
    }
}