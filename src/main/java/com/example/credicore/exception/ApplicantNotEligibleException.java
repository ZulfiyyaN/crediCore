package com.example.credicore.exception;

public class ApplicantNotEligibleException extends  RuntimeException{
    public ApplicantNotEligibleException(String message) {
        super(message);
    }
}
