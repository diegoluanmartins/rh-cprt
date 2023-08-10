package com.cprt;

public class InvalidSalaryIncreaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidSalaryIncreaseException(final String message){
        super(message);
    }
    
}
