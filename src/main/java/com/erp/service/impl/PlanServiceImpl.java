package com.erp.service.impl;

import com.erp.mapper.PlanMapper;
import com.erp.model.Plan;
import com.erp.service.PlanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("planService")
@Transactional
public class PlanServiceImpl implements PlanService
{
    @Autowired
    private PlanMapper planMapper;

    @Override
    public List<Plan> getList(Integer contractId)
    {
        Plan plan=new Plan();
        plan.setContractId(contractId);
        return planMapper.select(plan);
    }


    @Override
    public Plan getPlanById(Integer id)
    {
        return planMapper.selectByPrimaryKey(id);
    }
}