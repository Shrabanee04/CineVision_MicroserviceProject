package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.EventRequest;
import com.example.lifeloopbackend.dto.EventResponse;
import com.example.lifeloopbackend.entity.Event;
import com.example.lifeloopbackend.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendar")

public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @PostMapping
    public EventResponse addEvent(
            @RequestBody EventRequest request){

        return calendarService.addEvent(request);
    }

    @GetMapping
    public List<Event> getAllEvents(){

        return calendarService.getAllEvents();
    }
}
