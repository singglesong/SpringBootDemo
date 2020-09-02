package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.basic.BasicMenuUI;
import java.util.Random;

@RestController
@RequestMapping("/Test")
public class TestController {

    @GetMapping("/greeting")
    public String Greeting(){
        Random random = new Random();
        int i = random.nextInt();

        if(i>10){
            return "random int "+i+" bigger than 10  " ;
        }else {
            return "random int  "+i+" less than 10";
        }

    }

    @GetMapping("/greeting2")
    public String Greeting2(){
        Random random = new Random();
        int i = random.nextInt();

        if(i>10){
            return "random2 int "+i+" bigger than 10  " ;
        }else {
            return "random2 int  "+i+" less than 10";
        }

    }
}
