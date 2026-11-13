package com.mindcare.exceptions;

public class InvalidDosageException extends Exception {
    public InvalidDosageException() {
        super();
    }
    
    public InvalidDosageException(String message) {
        super(message);
    }
}
