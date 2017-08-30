package com.erp.service.impl;

import com.erp.mapper.ContractMapper;
import com.erp.model.Contract;
import com.erp.service.ContractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("contractService")
@Transactional
public class ContractServiceImpl implements ContractService
{
    @Autowired
    private ContractMapper contractMapper;

    @Override
    public List<Contract> getList(Contract contract)
    {
        return contractMapper.select(contract);
    }



    @Override
    public Contract getContractById(String contactNo)
    {
        Contract contract=new Contract();
        contract.setContractNo(contactNo);
        List<Contract> contracts=getList(contract);
        if(contracts.size()>0){
            return contracts.get(0);
        }
        return contract;
    }


}