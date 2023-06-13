package com.microservices.swagger.microservicesswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/all")
    public String getAll(){
        return "All docs..";
    }

    @GetMapping("/{message}")
    public String sendData(@PathVariable String message){
        return "Sent " + message;
    }
}
