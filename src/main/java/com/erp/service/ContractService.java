package com.erp.service;


import com.erp.model.Contract;

import java.util.List;

public interface ContractService
{
    List<Contract> getList(Contract contract);

    Contract getContractById(Integer id);

}
