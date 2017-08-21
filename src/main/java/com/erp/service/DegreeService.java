package com.erp.service;


import com.erp.model.Degree;

import java.util.List;

public interface DegreeService {
	List<Degree> getList(Degree degree);

	Degree queryById(Integer id);

}