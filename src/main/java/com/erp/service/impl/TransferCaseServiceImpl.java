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
    public List<TransferCase> getOperator(TransferCase transferCase) {

        Example example=new Example(TransferCase.class);
        example.createCriteria().andEqualTo("studentNo",transferCase.getStudentNo()).andEqualTo("role",transferCase.getRole());
        example.orderBy("receive").asc();
        return transferCaseMapper.selectByExample(example);
    }

    @Override
    public List<TransferCase> queryByOperatorId(List<Integer> operators, Integer countryId) {

        Example example=new Example(TransferCase.class);
        example.createCriteria().andEqualTo("countryId",countryId).andEqualTo("enableStatus",1)
        .andIn("laterOperator",operators).andEqualTo("result",1).andEqualTo("transferType",1);
        return transferCaseMapper.selectByExample(example);
    }
}