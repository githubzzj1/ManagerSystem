package com.z.manager.service.impl;

import com.z.manager.entity.Student;
import com.z.manager.mapper.StudentMapper;
import com.z.manager.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentByName(String name) {
        return studentMapper.getStudentByName(name);
    }
}
