package com.kai.messagespringboot.rest;

import com.kai.messagespringboot.common.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class DemoController {
    private MessageService messageService;

    @Autowired
    public void setMessageService(@Qualifier("SMSService") MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/send")
    public String send() {
        return messageService.SendMessage("Hello ca nha iu");
    }
}
