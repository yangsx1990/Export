package com.erp.service;


import com.erp.model.Operator;

import java.util.List;

public interface OperatorService
{
    List<Operator> getList(Operator operator);


    Operator getOperatorById(Integer id);
}
