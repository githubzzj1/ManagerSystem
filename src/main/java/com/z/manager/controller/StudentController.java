package com.z.manager.controller;

import com.z.manager.entity.Student;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/login")
    public String login(Student student){
        Subject subject = SecurityUtils.getSubject();
        if(!subject.isAuthenticated()){
            UsernamePasswordToken token=new UsernamePasswordToken(student.getUsername(),student.getPassword());
            try {
                subject.login(token);
            }catch (AuthorizationException e){
                return "login";
            }
        }
        return "index";
    }

}
