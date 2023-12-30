package com.ajaycodes.springdi.controllers;

import com.ajaycodes.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
