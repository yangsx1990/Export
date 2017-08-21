package com.erp.service;


import com.erp.model.Visa;

import java.util.List;

public interface VisaService
{
    List<Visa> getList(Visa visa);


    Visa getVisaById(Integer id);
}
