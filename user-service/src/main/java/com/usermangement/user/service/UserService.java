package com.usermangement.user.service;

import com.usermangement.user.VO.Department;
import com.usermangement.user.VO.ResponseTemplateVO;
import com.usermangement.user.entity.User;
import com.usermangement.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<User> getUserWithDept() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId()
                        , Department.class);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }

    public String deleteUser(Long userId) {
        userRepository.deleteById(userId);
        return "user deleted with id" + userId;
    }
}