package com.usermangement.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "department_details")
public class Department {

    @Id
    private Long departmentId;
    private String departmentName;
    private String departmentManager;
    private String departmentCode;

}