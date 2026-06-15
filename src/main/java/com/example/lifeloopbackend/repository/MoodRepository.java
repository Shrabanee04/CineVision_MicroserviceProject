package com.example.lifeloopbackend.repository;

import com.example.lifeloopbackend.entity.Mood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodRepository extends JpaRepository<Mood, Long> {

}
