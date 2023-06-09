package com.example.depedencyinjection.controllers;

import com.example.depedencyinjection.services.GreetingService;
import com.example.depedencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in a controller");
        return greetingService.sayGreeting();
    }
}
