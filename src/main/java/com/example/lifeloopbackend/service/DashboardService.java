package com.example.lifeloopbackend.service;

import com.example.lifeloopbackend.dto.DashboardResponse;
import com.example.lifeloopbackend.entity.Mood;
import com.example.lifeloopbackend.repository.EventRepository;
import com.example.lifeloopbackend.repository.ExpenseRepository;
import com.example.lifeloopbackend.repository.JournalRepository;
import com.example.lifeloopbackend.repository.MoodRepository;
import com.example.lifeloopbackend.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private JournalRepository journalRepository;

    @Autowired
    private MoodRepository moodRepository;

    @Autowired
    private ExpenseRepository expenseRepository;

    public DashboardResponse getDashboard(){

        long totalTasks = taskRepository.count();

        long totalEvents = eventRepository.count();

        long totalJournals = journalRepository.count();

        long totalMoodLogs = moodRepository.count();

        long totalExpenses = expenseRepository.count();

        String latestMood = "No Mood Logged";

        List<Mood> moods = moodRepository.findAll();

        if(!moods.isEmpty()){
            latestMood =
                    moods.get(moods.size()-1)
                            .getMood();
        }

        int productivityScore =
                (int)(totalTasks
                        + totalEvents
                        + totalJournals
                        + totalMoodLogs);

        return new DashboardResponse(

                totalTasks,

                totalEvents,

                totalJournals,

                totalMoodLogs,

                totalExpenses,

                latestMood,

                productivityScore

        );

    }

}