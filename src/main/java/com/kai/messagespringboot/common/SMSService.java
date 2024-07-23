package com.kai.messagespringboot.common;

import org.springframework.stereotype.Component;


@Component
public class SMSService implements MessageService {
    @Override
    public String SendMessage(String message) {
        return "SMS message: " + message;
    }
}
