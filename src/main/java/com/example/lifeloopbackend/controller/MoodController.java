package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.MoodRequest;
import com.example.lifeloopbackend.dto.MoodResponse;
import com.example.lifeloopbackend.entity.Mood;
import com.example.lifeloopbackend.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mood")

public class MoodController {

    @Autowired
    private MoodService moodService;

    @PostMapping
    public MoodResponse addMood(
            @RequestBody MoodRequest request){

        return moodService.addMood(request);
    }

    @GetMapping
    public List<Mood> getAllMoods(){

        return moodService.getAllMoods();
    }
}
