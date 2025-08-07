package com.metacoding.springbegin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/saveForm")
    public String saveForm() {
        return "board/saveForm";
    }
} 