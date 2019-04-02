package com.z.manager.controller;

import com.z.manager.entity.Student;
import com.z.manager.service.IStudentService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping("/login")
    public String login(Student student, ModelMap map){
        Student student1=studentService.getStudentByName(student.getName());
        map.put("user",student1);
        return "index";
    }

}
