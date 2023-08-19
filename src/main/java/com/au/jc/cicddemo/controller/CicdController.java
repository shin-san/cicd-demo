package com.au.jc.cicddemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/")
public class CicdController {

    @GetMapping("v1/hello")
    public ResponseEntity<?> helloWorld() {
        log.info("helloWorld() called!");
        return ResponseEntity.ok("Hello World: You have completed the CICD process!");
    }


}
