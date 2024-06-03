package com.vegadelalyra.helloworldapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @ResponseBody
    @GetMapping("/hello-world")
    public String showHelloWorldString() {
        return "Hello, World!! Welcome to my first SPRING App :D";
    }
}
