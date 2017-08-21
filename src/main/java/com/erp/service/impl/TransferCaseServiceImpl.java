package com.erp.service.impl;

import com.erp.mapper.TransferCaseMapper;
import com.erp.model.TransferCase;
import com.erp.service.TransferCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

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
}