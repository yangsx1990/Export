package com.erp.service;


import com.erp.model.Refund;

import java.util.List;

public interface RefundService
{
    List<Refund> getList(Refund refund);


    Refund getRefundById(Integer id);
}
