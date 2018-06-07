package com.chunam.rest;

import com.chunam.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/test")
    public String getTest(){
        userRepository.findByUserName("test");
        return "Hello world";
    }
}
