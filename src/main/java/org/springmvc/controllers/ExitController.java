package org.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class ExitController {
    @GetMapping("/exit")
    public String sayExit(){
        return "hello/exit";
    }
}
