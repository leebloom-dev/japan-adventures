package com.japanadventures.japanadventures.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // responds to GET requests at URL: "localhost:8080/"
    @GetMapping()
    public String displayHomepage() {
        return "index";
    }
    
}
