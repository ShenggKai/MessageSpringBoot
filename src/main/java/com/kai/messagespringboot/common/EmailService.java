package com.kai.messagespringboot.common;

public class EmailService implements MessageService {
    @Override
    public String SendMessage(String message) {
        return "Email message: " + message;
    }
}
