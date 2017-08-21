package com.erp.service;


import com.erp.model.AfterBusiness;

import java.util.List;

public interface AfterBusinessService
{
    List<AfterBusiness> getList(AfterBusiness afterBusiness);

    AfterBusiness getAfterBusinessById(Integer id);
}
