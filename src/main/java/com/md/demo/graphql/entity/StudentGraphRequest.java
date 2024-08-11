package com.md.demo.graphql.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentGraphRequest {
    private String sName;
    private int rollNo;
    private String sectionName;
    private String className;
    private String admissionYear;
}
