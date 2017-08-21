package com.erp.service.impl;


import com.erp.mapper.DegreeMapper;
import com.erp.model.Degree;
import com.erp.service.DegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("degreeService")
@Transactional
public class DegreeServiceImpl implements DegreeService {
	@Autowired
	private DegreeMapper degreeMapper;

	@Override
	public List<Degree> getList(Degree degree) {
		return degreeMapper.select(degree);
	}

	@Override
	public Degree queryById(Integer id) {
		return degreeMapper.selectByPrimaryKey(id);
	}

}