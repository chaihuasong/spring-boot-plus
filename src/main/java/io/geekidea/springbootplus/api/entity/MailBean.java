package io.geekidea.springbootplus.api.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MailBean implements Serializable {
    private String to;//邮件接收人
    private String subject; //邮件主题
    private String content; //邮件内容
}
