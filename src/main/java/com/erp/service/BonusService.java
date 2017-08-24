package com.erp.service;

import com.erp.model.Bonus;

import java.util.List;

public interface BonusService
{
    List<Bonus> getList(Bonus bonus);


    Bonus getBonusById(Integer id);
}
