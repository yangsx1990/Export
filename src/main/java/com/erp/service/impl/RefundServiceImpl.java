package com.erp.service.impl;

import com.erp.mapper.RefundMapper;
import com.erp.model.Refund;
import com.erp.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("refundService")
@Transactional
public class RefundServiceImpl implements RefundService
{
    @Autowired
    private RefundMapper refundMapper;

    @Override
    public List<Refund> getList(Refund refund)
    {
        return refundMapper.select(refund);
    }

    @Override
    public Refund getRefundById(Integer id)
    {
        return refundMapper.selectByPrimaryKey(id);
    }
}