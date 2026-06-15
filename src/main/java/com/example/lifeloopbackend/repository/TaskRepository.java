package com.example.lifeloopbackend.repository;

import com.example.lifeloopbackend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}