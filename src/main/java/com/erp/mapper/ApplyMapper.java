package com.erp.mapper;


import com.erp.model.Apply;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ApplyMapper extends Mapper<Apply>
{

    List<Apply> getByTransDate(Map<String,Object> param);

}