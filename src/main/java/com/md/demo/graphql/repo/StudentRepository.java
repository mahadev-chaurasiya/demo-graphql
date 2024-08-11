package com.md.demo.graphql.repo;

import com.md.demo.graphql.entity.Student;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
