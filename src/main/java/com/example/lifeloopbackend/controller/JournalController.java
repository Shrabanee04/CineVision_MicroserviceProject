package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.JournalRequest;
import com.example.lifeloopbackend.dto.JournalResponse;
import com.example.lifeloopbackend.entity.Journal;
import com.example.lifeloopbackend.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")

public class JournalController {

    @Autowired
    private JournalService journalService;

    @PostMapping
    public JournalResponse addJournal(
            @RequestBody JournalRequest request){

        return journalService.addJournal(request);
    }

    @GetMapping
    public List<Journal> getAllJournals(){

        return journalService.getAllJournals();
    }
}
