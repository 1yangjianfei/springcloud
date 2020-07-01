package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @author: Bi tong
 * @create: 2020-07-01 15:22
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/hello2/{id}")
    public User helloWorld(@PathVariable("id")Long id)
    {
        return userService.getById(id);
    }
}
