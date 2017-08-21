package com.erp.service.impl;

import com.erp.mapper.StudentInfoMapper;
import com.erp.model.StudentInfo;
import com.erp.service.StudentInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentInfoService")
@Transactional
public class StudentInfoServiceImpl implements StudentInfoService
{
    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentInfo> getList(StudentInfo studentInfo)
    {
        return studentInfoMapper.select(studentInfo);
    }




   /* @Override
    public int delStudentInfoById(Integer id)
    {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setDelFlag(0);
        studentInfo.setId(id);

        return studentInfoMapper.updateByPrimaryKeySelective(studentInfo);
    }

    @Override
    public int update(StudentInfo studentInfo)
    {
        return studentInfoMapper.updateByPrimaryKeySelective(studentInfo);
    }

    @Override
    public int insert(StudentInfo studentInfo)
    {
        studentInfo.setDelFlag(1);
        return studentInfoMapper.insert(studentInfo);
    }*/

    @Override
    public StudentInfo getStudentInfoById(Integer id)
    {
        return studentInfoMapper.selectByPrimaryKey(id);
    }
}