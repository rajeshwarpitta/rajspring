package com.raj.spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppConfiguration {
    @RequestMapping("/hello")
    public String hello(){return "Hello World!";}
    
    
}
