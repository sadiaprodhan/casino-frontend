package com.example.casino.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("start");
    }

    @GetMapping("/start-play")
    public ModelAndView startPlay(){
        return new ModelAndView("Play");
    }
}
