package com.batuhanbstrk.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/message")
    public String getMessage(){
        return "Batuhan Basturk";
    }
}
