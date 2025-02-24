package com.dozie.cicdapp.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping()
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok(Map.of("message", "Up and running"));
    }
}
