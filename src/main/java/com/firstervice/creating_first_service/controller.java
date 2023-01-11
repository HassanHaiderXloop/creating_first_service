package com.firstervice.creating_first_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/get")
    public String getcatch(){
        String s1= "here is the Assignmet of 6.2";
        return s1;
    }
    
}
