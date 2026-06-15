package com.example.lifeloopbackend.service;

import com.example.lifeloopbackend.dto.MoodRequest;
import com.example.lifeloopbackend.dto.MoodResponse;
import com.example.lifeloopbackend.entity.Mood;
import com.example.lifeloopbackend.repository.MoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodService {

    @Autowired
    private MoodRepository moodRepository;

    public MoodResponse addMood(MoodRequest request){

        Mood mood = new Mood();

        mood.setMood(request.getMood());
        mood.setNote(request.getNote());
        mood.setDate(request.getDate());

        moodRepository.save(mood);

        return new MoodResponse(
                "Mood Added Successfully!"
        );
    }

    public List<Mood> getAllMoods(){

        return moodRepository.findAll();

    }
}
