package com.cnergee.restapi.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
