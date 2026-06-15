package com.example.lifeloopbackend.service;

import com.example.lifeloopbackend.dto.AiRequest;
import com.example.lifeloopbackend.dto.AiResponse;
import com.example.lifeloopbackend.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiService {

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

    public AiResponse chat(AiRequest request){

        String message =
                request.getMessage().toLowerCase();

        if(message.contains("task")){

            return new AiResponse(
                    "You currently have "
                            + taskRepository.count()
                            + " tasks."
            );
        }

        if(message.contains("event")){

            return new AiResponse(
                    "You currently have "
                            + eventRepository.count()
                            + " events."
            );
        }

        if(message.contains("journal")){

            return new AiResponse(
                    "You have written "
                            + journalRepository.count()
                            + " journal entries."
            );
        }

        if(message.contains("mood")){

            return new AiResponse(
                    "You have logged "
                            + moodRepository.count()
                            + " moods."
            );
        }

        if(message.contains("expense")){

            return new AiResponse(
                    "You have "
                            + expenseRepository.count()
                            + " expense records."
            );
        }

        return new AiResponse(
                "I can help with tasks, events, journals, moods and expenses."
        );
    }
}
