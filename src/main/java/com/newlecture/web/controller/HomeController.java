package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/index")
    public String home(){
        return "Hello Sring Boot";
    }
    
    @GetMapping("/abab")
    public String aabb(){
     return "aaaa";   
    }
}
