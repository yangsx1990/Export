package com.erp.service;
import com.erp.model.Visit;

import java.util.List;

public interface VisitService
{
    List<Visit> getList(Visit visit);


    Visit getVisitById(Integer id);
}
