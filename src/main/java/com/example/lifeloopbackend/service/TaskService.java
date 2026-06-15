package com.example.lifeloopbackend.service;

import com.example.lifeloopbackend.dto.TaskRequest;
import com.example.lifeloopbackend.dto.TaskResponse;
import com.example.lifeloopbackend.entity.Task;
import com.example.lifeloopbackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public TaskResponse addTask(TaskRequest request){

        Task task = new Task();

        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setPriority(request.getPriority());
        task.setDeadline(request.getDeadline());
        task.setCategory(request.getCategory());

        task.setStatus("Pending");

        taskRepository.save(task);

        return new TaskResponse(
                "Task Added Successfully!"
        );
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    public TaskResponse updateTask(Long id, TaskRequest request){

        Task task = taskRepository.findById(id).orElse(null);

        if(task == null){
            return new TaskResponse("Task Not Found!");
        }

        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setPriority(request.getPriority());
        task.setDeadline(request.getDeadline());
        task.setCategory(request.getCategory());

        taskRepository.save(task);

        return new TaskResponse("Task Updated Successfully!");
    }


    public TaskResponse deleteTask(Long id){

        if(!taskRepository.existsById(id)){
            return new TaskResponse("Task Not Found!");
        }

        taskRepository.deleteById(id);

        return new TaskResponse("Task Deleted Successfully!");
    }


    public TaskResponse completeTask(Long id){

        Task task = taskRepository.findById(id).orElse(null);

        if(task == null){
            return new TaskResponse("Task Not Found!");
        }

        task.setStatus("Completed");

        taskRepository.save(task);

        return new TaskResponse("Task Completed Successfully!");
    }

}