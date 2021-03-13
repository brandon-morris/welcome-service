package com.freespecter.welcomeservice.controllers;

import com.freespecter.welcomeservice.models.WelcomeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryController {
    @Autowired
    WelcomeMessage wm;

    @GetMapping
    public WelcomeMessage returnWelcomeMessage(){
        return wm;
    }

}
