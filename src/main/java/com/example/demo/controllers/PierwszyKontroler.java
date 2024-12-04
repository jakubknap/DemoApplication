package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PierwszyKontroler {

    @GetMapping
    public String helloWorld() {
        return "Hello World from demo application";
    }
}