package com.z.manager.mapper;

import com.z.manager.dao.IBaseDao;
import com.z.manager.entity.Student;

public interface StudentMapper extends IBaseDao<Student> {
    Student getStudentByUserName(String username);
}
