package com.erp.service;


import com.erp.model.Urge;

import java.util.List;

public interface UrgeService
{
    List<Urge> getList(Urge urge);


    Urge getUrgeById(Integer id);
}
