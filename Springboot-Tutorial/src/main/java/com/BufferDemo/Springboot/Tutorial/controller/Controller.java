package com.BufferDemo.Springboot.Tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @GetMapping("/")
    public String Hello(){
        return "Welcome Divy";
    }
}
