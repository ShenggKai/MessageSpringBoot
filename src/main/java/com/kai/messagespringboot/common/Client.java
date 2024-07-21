package com.kai.messagespringboot.common;

public class Client {
    private MessageService messageService;

    public Client(MessageService messageService) {
        this.messageService = messageService;
    }

    public String sendMessage(String message) {
        return messageService.SendMessage(message);
    }
}
