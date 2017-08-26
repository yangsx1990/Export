package com.erp.service.impl;


import com.erp.mapper.MemberCountryMapper;
import com.erp.mapper.MemberMapper;
import com.erp.model.Exam;
import com.erp.model.Member;
import com.erp.model.MemberCountry;
import com.erp.service.MemberCountryService;
import com.erp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService
{
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> getList(Member member)
    {
        return memberMapper.select(member);
    }

    @Override
    public Member getByOaId(Integer oaId) {
        Example example=new Example(Member.class);
        example.createCriteria().andEqualTo("oaId",oaId);
        List<Member> members=memberMapper.selectByExample(example);
        if(members.size()>0){
            return members.get(0);
        }
        return new Member();
    }

    public static void main(String[] args) {
        List<Integer>  list=new ArrayList<>();
        list.add(1);
        if(!list.contains(1)){
            list.add(1);
        }
        if(!list.contains(2)){
            list.add(2);
        }
        System.out.println(list.size());
    }


}