package com.erp.service;


import com.erp.model.Exam;

import java.util.List;

public interface ExamService
{
    List<Exam> getList(String exam);


    Exam getExamById(Integer id);
}
