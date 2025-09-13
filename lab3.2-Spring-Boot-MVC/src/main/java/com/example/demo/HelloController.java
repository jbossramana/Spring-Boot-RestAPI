package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	
    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(required=false,name = "message",
                                   defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    
}


