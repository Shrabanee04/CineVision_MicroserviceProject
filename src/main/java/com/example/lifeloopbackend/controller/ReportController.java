package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.entity.User;
import com.example.lifeloopbackend.repository.UserRepository;
import com.example.lifeloopbackend.service.EmailService;
import com.example.lifeloopbackend.service.WeeklyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WeeklyReportService weeklyReportService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/weekly/{userId}")
    public Map<String, String> sendMyWeeklyReport(@PathVariable Long userId) {

        User user = userRepository.findById(userId).orElse(null);

        if (user == null) {
            return Map.of("message", "User not found.");
        }

        if (user.getEmail() == null || user.getEmail().isBlank()) {
            return Map.of("message", "User has no email on file.");
        }

        String report = weeklyReportService.buildReport(user);
        emailService.sendWeeklyReport(user.getEmail(), report);

        return Map.of("message", "Weekly report sent to " + user.getEmail());
    }
}
