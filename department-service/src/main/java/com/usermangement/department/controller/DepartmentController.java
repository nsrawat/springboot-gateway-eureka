package com.usermangement.department.controller;

import com.usermangement.department.entity.Department;
import com.usermangement.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
    @GetMapping("/all")
    public List<Department> getAlldepartment() {
        log.info("Inside getAlldepartment of DepartmentController");
        return departmentService.getAllDepartment();
    }
    @DeleteMapping("/{id}")
    public String deleteDept(@PathVariable("id") Long departmentId) {
        log.info("Inside deleteDept of DepartmentController");
        return departmentService.deleteDepartment(departmentId);
    }
}
