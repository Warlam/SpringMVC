package org.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello/hello_world";
    }
    @GetMapping("/goodbye")
    public String Goodbye(@RequestParam(value = "name",required = false) String name,
                          @RequestParam(value = "surname",required = false) String surname,
                          Model model){

        //System.out.println(name);
        //System.out.println(surname);
        model.addAttribute("name",name);
        model.addAttribute("surname",surname);
        return "hello/goodbye";
    }
}
