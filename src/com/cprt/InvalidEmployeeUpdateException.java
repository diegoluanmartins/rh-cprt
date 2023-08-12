package com.cprt;

public class InvalidEmployeeUpdateException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidEmployeeUpdateException(final String message){
        super(message);
    }
    
}
