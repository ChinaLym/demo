package com.lym.homework1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/testhello")
    public String hello(){
        return "Welcome to start SpringBoot!";
    }
}

