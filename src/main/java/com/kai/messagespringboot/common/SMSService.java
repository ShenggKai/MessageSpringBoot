package com.kai.messagespringboot.common;

public class SMSService implements MessageService {
    @Override
    public String SendMessage(String message) {
        return "SMS message: " + message;
    }
}
