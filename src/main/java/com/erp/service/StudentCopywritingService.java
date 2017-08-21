package com.erp.service;


import com.erp.model.StudentCopywriting;

import java.util.List;

public interface StudentCopywritingService
{
    List<StudentCopywriting> getList(StudentCopywriting studentCopywriting);



    StudentCopywriting getStudentCopywritingById(Integer id);

    StudentCopywriting getCopyWritingByStudentAndContract(StudentCopywriting studentCopywriting);
}
