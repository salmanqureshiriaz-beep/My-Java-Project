package com.FirstProject.JavaLearner.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HealthCare {
    @GetMapping("/healthcheck")
    public String healthCare(){
        return "HELLO SALMAN health is check is working properly";
    }
}
