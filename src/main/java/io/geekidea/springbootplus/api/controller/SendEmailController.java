package io.geekidea.springbootplus.api.controller;

import io.geekidea.springbootplus.api.entity.MailBean;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Api("API")
@RequestMapping("/mail")
public class SendEmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/send")
    public void sendMail(@RequestBody MailBean mail) {
        /*SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("chs-server@foxmail.com");
        message.setTo(mail.getTo());
        message.setSubject(mail.getSubject());
        message.setText(mail.getContent());
        javaMailSender.send(message);*/
    }
}
