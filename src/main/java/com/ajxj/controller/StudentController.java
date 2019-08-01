package com.ajxj.controller;

import com.ajxj.entities.Student;
import com.ajxj.service.StudentService;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class StudentController {
    @Autowired
    StudentService studentService;
//    查找全部

    @RequestMapping("/List")
    public String StudentAll(Student student, Model model){
        List<Student> list = studentService.list(student);
        model.addAttribute("list",list);
        return "List";
    }
//查找单个
 @Cacheable(cacheNames = {"student"})
   @RequestMapping("/stu")
    public  String findStudentId(Integer stuId, Model model){

        Student student = studentService.findStudentId(stuId);

        model.addAttribute("stu",student);
        return  "student";
    }
//跳转到新建页面
    @RequestMapping("/more")
    public  String insertStudent(){


        return "add";

    }
    //增加页面
    @RequestMapping("/add")
    public String insert(Student student){

    studentService.insertStudent(student);
        return "redirect:/List";

    }
}
