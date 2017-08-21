package com.erp.service.impl;

import com.erp.mapper.StudentCopywritingMapper;
import com.erp.model.StudentCopywriting;
import com.erp.service.StudentCopywritingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentCopywritingService")
@Transactional
public class StudentCopywritingServiceImpl implements StudentCopywritingService
{
    @Autowired
    private StudentCopywritingMapper studentCopywritingMapper;

    @Override
    public List<StudentCopywriting> getList(StudentCopywriting studentCopywriting)
    {
        return studentCopywritingMapper.select(studentCopywriting);
    }


    @Override
    public StudentCopywriting getStudentCopywritingById(Integer id)
    {
        return studentCopywritingMapper.selectByPrimaryKey(id);
    }

    @Override
    public StudentCopywriting getCopyWritingByStudentAndContract(StudentCopywriting studentCopywriting) {
        List<StudentCopywriting> studentCopywritings=studentCopywritingMapper.select(studentCopywriting);
        if(studentCopywritings.size()>0){
            return studentCopywritings.get(0);
        }
        return null;
    }
}