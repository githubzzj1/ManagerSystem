package com.z.manager.controller;

import com.z.manager.entity.Teacher;
import com.z.manager.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("/login")
    public String login(Teacher teacher, ModelMap map){
        Teacher teacher1 = teacherService.getTeacherByName(teacher.getName());
        map.put("user",teacher1);
        return "index";
    }

}
