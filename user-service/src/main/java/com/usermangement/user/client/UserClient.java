//package com.usermangement.user.client;
//
//import com.usermangement.user.VO.ResponseTemplateVO;
//import com.usermangement.user.entity.User;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//
//@FeignClient(name = "userClient", url = "http://localhost:9002")
//public interface UserClient  {
//
//
//
////    @GetMapping("/{id}")
////    public ResponseTemplateVO getUsers(Long userId);
//
//    @GetMapping("/users")
//    public List<User> getUsers();
//
////    @GetMapping("departments/dep")
////    public List<Object> getDepartments();
////
////    @PostMapping("/")
////    public User saveUser( User user);
//}
