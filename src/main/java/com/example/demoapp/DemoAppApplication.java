package com.example.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class DemoAppApplicatio {

   @GetMapping("/")
   public String getMessage(){
       return "Welocome to EnggAdda";
   }
   static Logger logger = Logger.getLogger(String.valueOf(DemoAppApplication.class));

    public static void main(String[] args) {

        System.out.println("Welcome to Enggadda");
        SpringApplication.run(DemoAppApplication.class, args);
        logger.info("hello everyone ");

    }

}
