package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
     @Autowired
    private EmailService emailService;

    @PostMapping
    public String submitContactForm(@RequestParam String phone, @RequestParam String email, @RequestParam String message) {
        emailService.sendContactMessage(phone, email, message);
        return "Form submitted successfully";
    }

    
}
