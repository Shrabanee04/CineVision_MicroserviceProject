package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.*;
import com.example.lifeloopbackend.service.AiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")

public class AiController {

    @Autowired
    private AiService aiService;

    @PostMapping("/chat")
    public AiResponse chat(
            @RequestBody AiRequest request){

        return aiService.chat(request);
    }
}
