package com.usermangement.user.controller;

import com.usermangement.user.VO.Department;
import com.usermangement.user.VO.ResponseTemplateVO;
import com.usermangement.user.entity.User;
import com.usermangement.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }

     @GetMapping("/all")
    public List<User> getUserWithDept() {
        log.info("Inside getUserWithDept of UserController");
        return userService.getUserWithDept();
    }

    @PostMapping("/add")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long userId) {
        log.info("Inside deleteUser of UserController");
        return userService.deleteUser(userId);
    }

}