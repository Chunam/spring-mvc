package com.chunam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String goHome(ModelMap modelMap){
        modelMap.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "home";
    }
}
