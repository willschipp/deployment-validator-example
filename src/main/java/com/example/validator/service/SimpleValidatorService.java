package com.example.validator.service;

import java.io.PrintStream;

public class SimpleValidatorService implements ValidatorService {

    public void validate(String location) throws Exception {
        validate(location,System.out);
    }

    public void validate(String location, PrintStream printStream) throws Exception {
        //load up the location
        //run it through the parser
        //done
    }
    
}
