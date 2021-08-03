package com.example.springboot001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/req")
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }


    @GetMapping("get")
    public String getstr(){
        return "this is a get request";
    }

    @PostMapping("post")
    public String poststr(){
        return "this is a post request";
    }
}
