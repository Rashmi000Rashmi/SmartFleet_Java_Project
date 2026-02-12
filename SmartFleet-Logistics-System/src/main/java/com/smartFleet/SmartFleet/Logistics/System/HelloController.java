package com.smartFleet.SmartFleet.Logistics.System;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



// This is the waiter's uniform. It tells Spring, "Hey, this class is a Controller." The Rest part means it will send back data (like text or JSON) directly to the customer rather than showing a whole HTML webpage.

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, welcome to SmartFleet Logistics System!";
    }
    
}
