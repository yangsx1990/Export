package com.erp.service;

import com.erp.model.Experience;

import java.util.List;

public interface ExperienceService
{
    List<Experience> getList(Experience experience);


    Experience getExperienceById(Integer id);
}
