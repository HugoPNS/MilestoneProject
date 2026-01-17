package com.gcu.milestone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello, World! Welcome to our Milestone Project! Updated message for the second time";
    }
}