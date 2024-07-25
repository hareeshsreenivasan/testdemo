package com.example.julydemo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class JulyController {

    @GetMapping("/ping")
    public String getMethodName(@RequestParam String param) {
        return "ping @"+ new Date();
    }
    

}
