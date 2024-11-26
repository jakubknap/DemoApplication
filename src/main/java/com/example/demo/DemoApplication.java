package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Witamy w aplikacji Spring Boot!");
        System.out.println("To gałąź mojaFunkcja - rozwijana druga funkcja.");
        System.out.println("Kolejna zmiana");
        SpringApplication.run(DemoApplication.class, args);
    }

}
