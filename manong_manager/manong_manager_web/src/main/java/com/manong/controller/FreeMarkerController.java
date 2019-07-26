package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Member;

@Controller
public class FreeMarkerController {

    @RequestMapping("hello")
    public String sayHello(Model model){
        model.addAttribute("name","xiaojingsong");
        return "hello";
    }

    @RequestMapping("hi")
    public String sayHi(Model model){
        model.addAttribute("name","xiaojingsong");
        return "hi";
    }
}
