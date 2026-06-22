package com.example.lifeloopbackend.service;

import com.example.lifeloopbackend.entity.User;
import com.example.lifeloopbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeeklyReportScheduler {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WeeklyReportService weeklyReportService;

    @Autowired
    private EmailService emailService;


    @Scheduled(cron = "0 0 8 * * MON")
    public void sendWeeklyReports() {

        List<User> users = userRepository.findAll();

        for (User user : users) {

            if (user.getEmail() == null || user.getEmail().isBlank()) {
                continue;
            }

            try {
                String report = weeklyReportService.buildReport(user);
                emailService.sendWeeklyReport(user.getEmail(), report);
            } catch (Exception e) {
                System.err.println("Failed to send weekly report to "
                        + user.getEmail() + ": " + e.getMessage());
            }
        }
    }
}
