package com.erp.service;


import com.erp.model.Member;
import com.erp.model.MemberCountry;

import java.util.List;

public interface MemberService
{
    List<Member> getList(Member member);


    Member getByOaId(Integer oaId);
}
