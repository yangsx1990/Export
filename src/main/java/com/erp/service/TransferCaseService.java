package com.erp.service;


import com.erp.model.TransferCase;

import java.util.List;

public interface TransferCaseService
{


    TransferCase getTransferCaseById(Integer id);

    List<TransferCase> getOperator(TransferCase transferCase);
}
