package com.aotusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"/", "/index.html"})
    public String index(){
        return "index";
    }
    @RequestMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
}
