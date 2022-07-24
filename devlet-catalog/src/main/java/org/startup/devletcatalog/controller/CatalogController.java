package org.startup.devletcatalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @GetMapping("/test")
    public String helloWorld(){
        return "catalog working!";
    }

}
