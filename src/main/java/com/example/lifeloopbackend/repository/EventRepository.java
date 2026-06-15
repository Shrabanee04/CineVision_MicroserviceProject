package com.example.lifeloopbackend.repository;

import com.example.lifeloopbackend.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository
        extends JpaRepository<Event, Long> {

}
