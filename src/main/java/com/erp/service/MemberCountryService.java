package com.erp.service;


import com.erp.model.MemberCountry;

import java.awt.*;
import java.util.List;

public interface MemberCountryService
{
    List<MemberCountry> getList(MemberCountry member);


    List<MemberCountry> getListByOaId(Integer oaId);
}
