package com.kai.messagespringboot.rest;

import com.kai.messagespringboot.common.Client;
import com.kai.messagespringboot.common.EmailService;
import com.kai.messagespringboot.common.SMSService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class DemoController {
    EmailService emailService = new EmailService();
    SMSService smsService = new SMSService();

    Client newClient = new Client(smsService);
    String result = newClient.sendMessage("Hello World");

    @GetMapping("/send")
    public String send() {
        return result;
    }
}
