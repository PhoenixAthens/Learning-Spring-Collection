package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
//    public String sayHello(String name){
//
//    }
    @GetMapping("/hello")
    public String sayHello(
            @RequestParam(value="name", required=false,
            defaultValue = "World") String name, Model model){
        model.addAttribute("user", name);
        return "hello";
    }
}
