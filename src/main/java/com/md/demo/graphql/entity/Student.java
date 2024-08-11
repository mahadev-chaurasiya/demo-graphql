package com.md.demo.graphql.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "STUDENT_INFO")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sName;
    private int rollNo;
    private String sectionName;
    private String className;
    private String admissionYear;
}
