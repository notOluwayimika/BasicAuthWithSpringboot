package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class TemplateController {
    @GetMapping("login")
    public String getLogin(){
        return "loginPage.html";
    }
    @GetMapping("courses")
    public String getCourses(){
        return "courses.html";
    }
}
