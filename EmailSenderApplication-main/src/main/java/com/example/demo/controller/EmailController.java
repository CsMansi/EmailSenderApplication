package com.example.demo.controller;

import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(
         String to,
         String subject,
         String body) {
        if (to == null || to.isEmpty()) {
            return ResponseEntity.badRequest().body("Recipient email (to) is required.");
        }
        if (subject == null || subject.isEmpty()) {
            subject = "No Subject";
        }
        if (body == null || body.isEmpty()) {
            body = "No Body";
        }
        String result = emailService.sendEmail(to, subject, body);
        return ResponseEntity.ok(result);
    }


}
