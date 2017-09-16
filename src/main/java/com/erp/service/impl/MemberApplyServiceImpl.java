package com.erp.service.impl;

import com.erp.mapper.MemberApplyMapper;
import com.erp.model.Exam;
import com.erp.model.MemberApply;
import com.erp.service.MemberApplyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("memberApplyService")
@Transactional
public class MemberApplyServiceImpl implements MemberApplyService
{
    @Autowired
    private MemberApplyMapper memberApplyMapper;

    @Override
    public List<MemberApply> getList(MemberApply memberApply)
    {
        return memberApplyMapper.select(memberApply);
    }



    @Override
    public MemberApply getMemberApplyById(Integer id)
    {
        return memberApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<MemberApply> getListByCountry(List<Integer> country,int memberId) {
        Example example=new Example(MemberApply.class);
       Example.Criteria criteria= example.createCriteria().andIn("countryId",country);
       if( memberId!=0){
           criteria.andEqualTo("memberId",memberId);
       }
        return memberApplyMapper.selectByExample(example);
    }
}