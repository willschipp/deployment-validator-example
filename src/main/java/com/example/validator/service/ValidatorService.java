package com.example.validator.service;

import java.io.PrintStream;

public interface ValidatorService {
    
    void validate(String location) throws Exception;

    void validate(String location,PrintStream printStream) throws Exception;
}
