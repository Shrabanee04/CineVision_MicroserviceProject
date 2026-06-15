package com.example.lifeloopbackend.service;

import com.example.lifeloopbackend.dto.EventRequest;
import com.example.lifeloopbackend.dto.EventResponse;
import com.example.lifeloopbackend.entity.Event;
import com.example.lifeloopbackend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    @Autowired
    private EventRepository eventRepository;

    public EventResponse addEvent(EventRequest request){

        Event event = new Event();

        event.setTitle(request.getTitle());
        event.setDescription(request.getDescription());
        event.setDate(request.getDate());
        event.setTime(request.getTime());
        event.setType(request.getType());

        eventRepository.save(event);

        return new EventResponse(
                "Event Added Successfully!"
        );
    }

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }
}
