package com.example.simplewebapp.controller;


// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    //@ResponseBody //it return the string to the browser as a response instead returning of a file. 1>>  see there are2 techniques to return a response(content of that response , not a entire file) these 2 techniques are-->> i) @ResponseBody-if we use @ResponseBody annotation then no need of using the @RestController and obviously it will under the class file.   ii) @RestController-if we use it then no need to write the @responsebody beacuse in RestControoler there is already present ResponseBody .
    public String home(){
        return "hello sanju";
    }


    @RequestMapping("/about")
    public String about(){
        
        return "This is about page";
    }
}
