package com.md.demo.graphql.service;

import com.md.demo.graphql.entity.Student;

import java.util.List;

public interface StudentService {
    Student admission(Student student);
    List<Student> getAllStudent();
    Student getStudent(int studentId);
    String deleteStudentRecordById(int studentId);
}
