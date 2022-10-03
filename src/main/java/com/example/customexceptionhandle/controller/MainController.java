package com.example.customexceptionhandle.controller;

import com.example.customexceptionhandle.exception.WrongInputException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping("/test/{input}")
    public String test(@PathVariable("input") String input){
        if(input.equalsIgnoreCase("abc")){
            throw new WrongInputException("Please input the valid word");
        }
        return input;
    }
}
