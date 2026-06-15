package com.example.lifeloopbackend.repository;

import com.example.lifeloopbackend.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
