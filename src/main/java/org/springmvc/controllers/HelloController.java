package org.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello/hello_world";
    }
    @GetMapping("/goodbye")
    public String Goodbye(){
        return "hello/goodbye";
    }
}
