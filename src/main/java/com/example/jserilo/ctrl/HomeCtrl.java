package com.example.jserilo.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCtrl {

    private static Logger log = LoggerFactory.getLogger(HomeCtrl.class.getName());


    @GetMapping("/")
    public String home(){

        log.debug("home() - entry");

        return "home";
    }


    @GetMapping("/post")
    public String post(){

        log.debug("post() - entry");

        return "post";
    }
    
}
