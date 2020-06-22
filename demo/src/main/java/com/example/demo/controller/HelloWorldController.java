package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @author: Bi tong
 * @create: 2020-06-22 17:18
 **/
@RestController
public class HelloWorldController {
    @RequestMapping("/hello/{name}")
    public String helloWorld(@PathVariable("name")String name)
    {
        System.out.println("hello world"+name);
        return "hello world"+name+"springboot welcome";
    }
}
