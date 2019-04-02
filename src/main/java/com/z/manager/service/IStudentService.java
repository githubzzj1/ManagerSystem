package com.z.manager.service;

import com.z.manager.entity.Student;

public interface IStudentService {
    Student getStudentByUserName(String username);
}
