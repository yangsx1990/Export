package com.erp.service;


import com.erp.model.Apply;

import java.util.List;

public interface ApplyService
{
    List<Apply> getList(Apply apply);


    Apply getApplyById(Integer id);
}
