package com.erp.service;


import com.erp.model.TransferCase;

import java.util.List;

public interface TransferCaseService
{


    List<TransferCase> getOperator(TransferCase transferCase);

    List<TransferCase> queryByOperatorId(List<Integer> operators,Integer  countryId);

}
