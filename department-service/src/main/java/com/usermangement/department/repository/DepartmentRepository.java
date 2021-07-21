package com.usermangement.department.repository;

import com.usermangement.department.entity.Department;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;


public interface DepartmentRepository extends MongoRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}