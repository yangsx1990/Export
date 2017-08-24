package com.erp.service;



import com.erp.model.Offer;

import java.util.List;

public interface OfferService
{
    List<Offer> getList(Offer offer);


    Offer getOfferById(Integer id);
}
