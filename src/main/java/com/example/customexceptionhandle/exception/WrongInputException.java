package com.example.customexceptionhandle.exception;

public class WrongInputException extends RuntimeException{
    private static final long serialVersionUID = -3471069261115284370L;

    public WrongInputException(String message){
        super(message);
    }
}
