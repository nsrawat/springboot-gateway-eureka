//package com.usermangement.user.client;
//
//import com.usermangement.user.entity.User;
//import feign.Client;
//import feign.RequestInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.net.InetSocketAddress;
//import java.net.Proxy;
//import java.util.List;
//
//public interface FeignClientConfig {
//
//    @GetMapping("users/all")
//    public List<Object> getUsers();
//
//    @GetMapping("departments/dep")
//    public List<Object> getDepartments();
//
//    @PostMapping("/")
//    public User saveUser(User user);
//}
