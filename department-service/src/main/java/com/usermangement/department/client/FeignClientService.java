//package com.usermangement.department.client;
//
//import com.usermangement.department.entity.Department;
//import feign.Headers;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.List;
//
//@Headers("Content-Type: application/json")
//@FeignClient(name = "${feign.name}", url = "${feign.url}")
//public interface FeignClientService {
//
//        @RequestMapping(value = "/departments/save", method = RequestMethod.POST)
//        Department save(@RequestBody Department department);
//
//    @GetMapping("/departments/al")
//    public List<Department> getAlldepartments();
//
//    }
//
