package com.platzi.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class HolaMundoController {
    
    @GetMapping("/hi")
    public String sayHello() {
        return "Hello world ";
    }
}
