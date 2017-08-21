package com.erp.service;


import com.erp.model.Supplement;

import java.util.List;

public interface SupplementService
{
    List<Supplement> getList(Supplement supplement);



    Supplement getSupplementById(Integer id);
}
