package com.md.demo.graphql.entity;

import com.md.demo.graphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @MutationMapping("enrollStudent")
    private Student enroll(@Argument StudentGraphRequest student){
        return studentService.admission(toStudent(student));
    }


    @QueryMapping("getAllStudentInfo")
    private List<Student> fetchAllStudent(){
        return studentService.getAllStudent();
    }

    @QueryMapping("getStudentInfo")
    private Student fetchStudentDataById( @Argument int studentId){
        return studentService.getStudent(studentId);
    }

    @QueryMapping("deleteStudentRecordById")
    private String deleteStudentRecordById(@Argument int studentId){
        return studentService.deleteStudentRecordById(studentId);
    }
    private Student toStudent(StudentGraphRequest request){
        return Student.builder()
                .sName(request.getSName())
                .rollNo(request.getRollNo())
                .sectionName(request.getSectionName())
                .className(request.getClassName())
                .admissionYear(request.getAdmissionYear())
                .build();
    }
}
