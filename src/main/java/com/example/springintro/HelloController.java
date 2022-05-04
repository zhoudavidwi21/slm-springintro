package com.example.springintro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int count = 0;

    private boolean online = true;
    private String message = "Hallo";

    @RequestMapping("/count")
    public String count(){
        count++;
        return "Count: " + count;
    }

    @RequestMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/at")
    public String hallo(){
        return "Hallo Welt!";
    }

}
