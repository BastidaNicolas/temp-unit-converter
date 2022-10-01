package com.tempconverter.tempconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempConverter {

    @GetMapping("/convert/returnCel")
    public Float returnCel(@RequestParam float temp){
        return (temp - 32)/1.8f;
    }

    @GetMapping("/convert/returnFer")
    public  Float retrunFer(@RequestParam float temp){
        return (temp * 1.8f) + 32;
    }

}
