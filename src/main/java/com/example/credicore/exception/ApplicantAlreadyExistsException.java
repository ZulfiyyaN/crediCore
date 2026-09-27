package com.example.credicore.exception;

public class ApplicantAlreadyExistsException  extends RuntimeException{
    public ApplicantAlreadyExistsException(String message) {
        super(message);
    }
}
