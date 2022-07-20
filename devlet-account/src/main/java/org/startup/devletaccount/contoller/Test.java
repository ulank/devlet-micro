package org.startup.devletaccount.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
