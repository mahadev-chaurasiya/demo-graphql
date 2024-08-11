package com.md.demo.graphql.service.impl;

import com.md.demo.graphql.entity.Student;
import com.md.demo.graphql.repo.StudentRepository;
import com.md.demo.graphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public Student admission(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(int studentId) {
        return studentRepository.findById(studentId).orElseThrow();
    }

    @Override
    public String deleteStudentRecordById(int studentId) {
        if (studentRepository.existsById(studentId)){
            studentRepository.deleteById(studentId);
            return "Record has been deleted :"+studentId;
        }else {
            return "An error occurred while deleting the student record"+studentId;
        }
    }
}
