package com.v1.alphavantage.managers;

import com.v1.alphavantage.dtos.FormEmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailManagerImp implements EmailManager {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public String sendEmail(FormEmailDTO formEmailDTO) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("victorcastaleix@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);
     return "a";
    }

 }
