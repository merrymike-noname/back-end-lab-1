package com.kovalenko.backendlab1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthcheckController {
    @GetMapping("/healthcheck")
    public Map<String, Object> healthcheck() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "ok");
        response.put("time", new Date());
        return response;
    }
}
