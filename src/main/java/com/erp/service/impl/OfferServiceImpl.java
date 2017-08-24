package com.erp.service.impl;

import com.erp.mapper.OfferMapper;
import com.erp.model.Offer;
import com.erp.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("offerService")
@Transactional
public class OfferServiceImpl implements OfferService
{
    @Autowired
    private OfferMapper offerMapper;

    @Override
    public List<Offer> getList(Offer offer)
    {
        return offerMapper.select(offer);
    }


    @Override
    public Offer getOfferById(Integer id)
    {
        return offerMapper.selectByPrimaryKey(id);
    }
}