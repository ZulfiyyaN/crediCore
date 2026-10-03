package com.example.credicore.exception;

public class IncomeIsNotEnoughException extends RuntimeException{
    public IncomeIsNotEnoughException(String message) {
        super(message);
    }
}
