package com.kai.messagespringboot.common;

import org.springframework.stereotype.Component;


@Component
public class EmailService implements MessageService {
    @Override
    public String SendMessage(String message) {
        return "Email message: " + message;
    }
}
