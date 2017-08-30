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

@Service("memberCountryService")
@Transactional
public class MemberCountryServiceImpl implements MemberCountryService
{
    @Autowired
    private MemberCountryMapper memberCountryMapper;

    @Autowired
    private MemberService memberService;

    @Override
    public List<MemberCountry> getList(MemberCountry member)
    {
        return memberCountryMapper.select(member);
    }


  /*  private List<MemberCountry> getOaList(List<Integer> oaIds)
    {
        Example example=new Example(MemberCountry.class);
        example.createCriteria().andIn("oaId",oaIds);
        return memberCountryMapper.selectByExample(example);
    }*/


  /*  private  List<MemberCountry> getByOaId(Integer oaId) {
        MemberCountry memberCountry=new MemberCountry();
        memberCountry.setOaId(oaId);
        return getList(memberCountry);
    }*/

    @Override
    public List<MemberCountry> getListByOaId(Integer oaId) {
        Member member=memberService.getByOaId(oaId);
        if(member.getId()==null){
           throw new RuntimeException("员工信息异常");
        }
        if(member.getPosition()==null){
            throw new RuntimeException("员工职位信息异常");
        }
        if(member.getPosition()==1 || member.getPosition()==2){
            MemberCountry memberCountry=new MemberCountry();
            memberCountry.setOaId(member.getOaId());
            return getList(memberCountry);
        }else if(member.getPosition()==3 ){
            List<Integer> list=new ArrayList<>();
           //暂时写死
            if(oaId==43){ //澳新
                list.add(1);
                list.add(2);
            }else if(oaId==383) {  //美加
                list.add(4);
                list.add(5);
            }else if(oaId==11222){ //英国
                list.add(3);
            }else{
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
            }

            return getMemberCountry(list);
        }
        return null;
    }

    private List<MemberCountry> getMemberCountry(List<Integer> countryIds){
        Example example=new Example(MemberCountry.class);
        example.createCriteria().andIn("countryId",countryIds);
        return memberCountryMapper.selectByExample(example);
    }

}