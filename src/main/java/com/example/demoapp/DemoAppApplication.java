package com.example.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class DemoAppApplication {

   @GetMapping("/")
   public String getMessage(){
       return "Welocome to EnggAdda";
   }

    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }

}
