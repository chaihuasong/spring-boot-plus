package io.geekidea.springbootplus.api.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {
    @Bean
    public JavaMailSenderImpl mailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        javaMailSender.setProtocol("smtp");
        javaMailSender.setHost("smtp.qq.com");
        javaMailSender.setPort(587);
        javaMailSender.setUsername("chs-server@foxmail.com");
        javaMailSender.setPassword("ngzuripvnfnabfjc");

        return javaMailSender;
    }
}
