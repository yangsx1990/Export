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



    @Override
    public StudentInfo getStudentInfoById(String  studentNo)
    {
        StudentInfo studentInfo=new StudentInfo();
        studentInfo.setSystemNo(studentNo);
       List<StudentInfo> students= studentInfoMapper.select(studentInfo);
       if(students!=null && students.size()>0){
           return students.get(0);
       }
        return studentInfo;
    }
}