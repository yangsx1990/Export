package com.erp.service;


import com.erp.model.Apply;

import java.util.Date;
import java.util.List;

public interface ApplyService
{
    List<Apply> getList(Apply apply);


    Apply getApplyById(Integer id);

    List<Apply> getByStuNos(List<String> stuNos, Date startDate, Date endDate);

    List<Apply> getByNos(List<String> stuNos);
}
