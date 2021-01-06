package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${config}")
    private String config;

    @GetMapping("/config")
    public ResponseEntity<String> config()
    {
        return ResponseEntity.ok("config " + config);
    }

    @GetMapping("/default")
    public ResponseEntity<String> hello()
    {
        return ResponseEntity.ok("hi " + name);
    }

}