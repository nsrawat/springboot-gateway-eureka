package com.usermangement.department.service;

import com.usermangement.department.entity.Department;
import com.usermangement.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public List<Department> getAllDepartment() {

        return departmentRepository.findAll();
    }

    public String deleteDepartment(Long departmentId) {

        departmentRepository.deleteById(departmentId);
        return "department deleted with id"+departmentId;
    }
}
