package com.example.simplewebapp.controller;

// import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
// @Component

public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "this is login page";
    }
}
