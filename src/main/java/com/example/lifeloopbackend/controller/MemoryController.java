package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.*;
import com.example.lifeloopbackend.service.MemoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/memory")

public class MemoryController {

    @Autowired
    private MemoryService memoryService;

    @PostMapping
    public MemoryResponse recall(
            @RequestBody
            MemoryRequest request){

        return memoryService.recall(request);
    }
}
