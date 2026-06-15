package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.DashboardResponse;
import com.example.lifeloopbackend.service.DashboardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")

public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping
    public DashboardResponse getDashboard(){

        return dashboardService.getDashboard();

    }

}