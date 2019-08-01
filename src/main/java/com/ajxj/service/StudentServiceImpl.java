package com.ajxj.service;

import com.ajxj.entities.Student;

import com.ajxj.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> list(Student student) {
        return studentMapper.list(student);
    }

    public Student findStudentId(Integer stuId) {
        System.out.println("查询"+stuId+"号学生");
        return studentMapper.findStudentId(stuId);
    }


    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
}
