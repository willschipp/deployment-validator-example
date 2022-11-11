package com.example.validator;

import com.example.validator.service.ValidatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    ValidatorService validatorService;

    public void run(String... args) throws Exception {
        if (args.length < 1) {
            throw new IllegalArgumentException("missing file location for validating");
        } //end if
        //invoke
        validatorService.validate(args[0],System.out);
    }
    
    
}
