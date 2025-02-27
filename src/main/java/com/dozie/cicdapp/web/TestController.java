package com.dozie.cicdapp.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

//@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok(Map.of("message", "Up and running"));
    }

    @GetMapping("/good")
    public ResponseEntity<Map<String, String>> good() {
        return ResponseEntity.ok(Map.of("status", "Good is Up and running"));
    }
}
