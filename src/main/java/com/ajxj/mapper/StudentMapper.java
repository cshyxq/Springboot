package com.ajxj.mapper;

import com.ajxj.entities.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student>list(Student student);
    public  Student findStudentId(Integer stuId);
    public  int insertStudent(Student student);
}
