package com.z.manager.service.impl;


import com.z.manager.entity.Teacher;
import com.z.manager.mapper.TeacherMapper;
import com.z.manager.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher getTeacherByName(String name) {
        return teacherMapper.getTeacherByName(name);
    }
}
