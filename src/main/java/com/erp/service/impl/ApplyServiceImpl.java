package com.erp.service.impl;


import com.erp.mapper.ApplyMapper;
import com.erp.model.Apply;
import com.erp.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("applyService")
@Transactional
public class ApplyServiceImpl implements ApplyService
{
    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public List<Apply> getList(Apply apply)
    {
        return applyMapper.select(apply);
    }


    @Override
    public Apply getApplyById(Integer id)
    {
        return applyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Apply> getByStuNos(List<String> stuNos) {
        Example example=new Example(Apply.class);
        example.createCriteria().andIn("studentNo",stuNos);
        return applyMapper.selectByExample(example);
    }

}