package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.TaskRequest;
import com.example.lifeloopbackend.dto.TaskResponse;
import com.example.lifeloopbackend.entity.Task;
import com.example.lifeloopbackend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")

public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public TaskResponse addTask(
            @RequestBody TaskRequest request){

        return taskService.addTask(request);

    }
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PutMapping("/{id}")
    public TaskResponse updateTask(
            @PathVariable Long id,
            @RequestBody TaskRequest request){

        return taskService.updateTask(id, request);

    }

    @DeleteMapping("/{id}")
    public TaskResponse deleteTask(@PathVariable Long id){

        return taskService.deleteTask(id);

    }


    @PutMapping("/complete/{id}")
    public TaskResponse completeTask(@PathVariable Long id){

        return taskService.completeTask(id);

    }

}