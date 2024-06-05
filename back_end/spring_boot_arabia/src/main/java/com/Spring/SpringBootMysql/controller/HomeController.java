package com.Spring.SpringBootMysql.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String welComeMessage() {
        return "Hello welcome to Spring Boot Application .";
    }
}
