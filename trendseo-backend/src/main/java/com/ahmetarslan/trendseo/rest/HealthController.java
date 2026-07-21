package com.ahmetarslan.trendseo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Value("${health.message}")
    private String healthMessage;

    @GetMapping("/health")
    public String health(){
        return "Message:"+healthMessage;
    }
}
