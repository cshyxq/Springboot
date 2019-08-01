package com.ajxj.service;

import com.ajxj.entities.Student;

import java.util.List;


public interface StudentService {
    public List<Student> list (Student student);

public Student findStudentId(Integer stuId);
public int insertStudent(Student  student);


}

