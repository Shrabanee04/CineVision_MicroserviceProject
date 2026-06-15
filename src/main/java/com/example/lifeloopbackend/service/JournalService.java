package com.example.lifeloopbackend.service;

import com.example.lifeloopbackend.dto.JournalRequest;
import com.example.lifeloopbackend.dto.JournalResponse;
import com.example.lifeloopbackend.entity.Journal;
import com.example.lifeloopbackend.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public JournalResponse addJournal(JournalRequest request){

        Journal journal = new Journal();

        journal.setTitle(request.getTitle());
        journal.setContent(request.getContent());
        journal.setDate(request.getDate());
        journal.setMood(request.getMood());

        journalRepository.save(journal);

        return new JournalResponse(
                "Journal Added Successfully!"
        );
    }

    public List<Journal> getAllJournals(){

        return journalRepository.findAll();

    }
}
