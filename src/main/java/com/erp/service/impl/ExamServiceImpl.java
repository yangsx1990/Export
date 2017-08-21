package com.erp.service.impl;

import com.erp.mapper.ExamMapper;
import com.erp.model.Exam;
import com.erp.service.ExamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("examService")
@Transactional
public class ExamServiceImpl implements ExamService
{
    @Autowired
    private ExamMapper examMapper;

    @Override
    public List<Exam> getList(Integer exam)
    {
        Example example=new Example(Exam.class);
        example.createCriteria().andEqualTo("studentId",exam);
        example.orderBy("examTime").desc();
        return examMapper.selectByExample(example);
    }


    @Override
    public Exam getExamById(Integer id)
    {
        return examMapper.selectByPrimaryKey(id);
    }
}