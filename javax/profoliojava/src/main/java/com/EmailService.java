package com;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private JavaMailSender mailSender;

    public void sendContactMessage(String phone, String email, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("Davfash1@gmail.com");
        mailMessage.setSubject("New Contact Form Submission");
        mailMessage.setText("Phone: " + phone + "\nEmail: " + email + "\nMessage: " + message);
        mailSender.send(mailMessage);
    }
    
}
