package com.briup.sb.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String get(){
        return "121431413";
    }
    @PostMapping("/hello1")
    public String ji(){
        return "sdasdasdsda";
    }
}
