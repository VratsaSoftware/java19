package com.example.demo.model;

public class InvalidPasswordException extends Exception{

    public InvalidPasswordException(String message) {
        super(message);
    }
}
