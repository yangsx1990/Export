package com.erp.service;


import com.erp.model.Plan;

import java.util.List;

public interface PlanService
{
    List<Plan> getList(Integer plan);



    Plan getPlanById(Integer id);
}
