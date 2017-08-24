package com.erp.service.impl;

import com.erp.mapper.BonusMapper;
import com.erp.model.Bonus;
import com.erp.service.BonusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bonusService")
@Transactional
public class BonusServiceImpl implements BonusService
{
    @Autowired
    private BonusMapper bonusMapper;

    @Override
    public List<Bonus> getList(Bonus bonus)
    {
        return bonusMapper.select(bonus);
    }


    @Override
    public Bonus getBonusById(Integer id)
    {
        return bonusMapper.selectByPrimaryKey(id);
    }
}