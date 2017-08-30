package com.erp.service;


import com.erp.model.StudentInfo;

import java.util.List;

public interface StudentInfoService
{
    List<StudentInfo> getList(StudentInfo studentInfo);

    /*int    delStudentInfoById(Integer id);

    int    update(StudentInfo studentInfo);//全量更新,请注意保证每个字段的完整

    int    insert(StudentInfo studentInfo);*/

    StudentInfo getStudentInfoById(String  studentNo);
}
