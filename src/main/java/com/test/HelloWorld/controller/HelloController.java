package com.test.HelloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/quickhello")
    public String quickhello(){
     return"quick hello!";
    }

}
