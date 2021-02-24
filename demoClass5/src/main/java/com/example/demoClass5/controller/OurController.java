package com.example.demoClass5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OurController {

    @RequestMapping("/")
    //@ResponseBody comment this if you have to call html file in templates
    public String ListItems(){
        return "home";
    }
}
