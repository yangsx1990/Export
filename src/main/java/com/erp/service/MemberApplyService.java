package com.erp.service;

import com.erp.model.MemberApply;

import java.util.List;

public interface MemberApplyService
{
    List<MemberApply> getList(MemberApply memberApply);


    MemberApply getMemberApplyById(Integer id);

    List<MemberApply> getListByCountry(List<Integer> country,int memberId);
}
