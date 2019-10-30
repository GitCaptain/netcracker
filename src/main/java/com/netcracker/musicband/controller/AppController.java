package com.netcracker.musicband.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class AppController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/main")
    public String main(Map<String, Object> model){
        return "main";
    }
}
