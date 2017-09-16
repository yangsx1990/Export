package com.erp.service.impl;


import com.erp.mapper.ApplyMapper;
import com.erp.model.Apply;
import com.erp.service.ApplyService;
import freemarker.template.SimpleDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public List<Apply> getByStuNos(List<String> stuNos,Date startDate,Date endDate) {
      /*  Example example=new Example(Apply.class);
        example.createCriteria().andIn("studentNo",stuNos);
        return applyMapper.selectByExample(example);*/
      Map<String,Object> params=new HashMap<>();
      params.put("list",stuNos);
      if(startDate!=null){
          params.put("startDate",startDate);
      }
      if(endDate!=null){
          params.put("endDate",endDate);
      }
      return applyMapper.getByTransDate(params);
    }

    @Override
    public List<Apply> getByNos(List<String> stuNos) {
        Example example=new Example(Apply.class);
        example.createCriteria().andIn("studentNo",stuNos);
        return applyMapper.selectByExample(example);
    }

}