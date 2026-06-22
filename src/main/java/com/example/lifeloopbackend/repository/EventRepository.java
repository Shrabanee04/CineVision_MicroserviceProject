package com.example.lifeloopbackend.repository;

import com.example.lifeloopbackend.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface EventRepository
        extends JpaRepository<Event, Long> {

    List<Event> findByNotifiedFalseAndEventDateTimeBetween(
            LocalDateTime start,
            LocalDateTime end
    );

}
