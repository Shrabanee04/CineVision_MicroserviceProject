package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.AuthResponse;
import com.example.lifeloopbackend.dto.LoginRequest;
import com.example.lifeloopbackend.dto.RegisterRequest;
import com.example.lifeloopbackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3001")

public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request){

        return authService.register(request);

    }
    @PostMapping("/login")
    public String login(
            @RequestBody LoginRequest request){

        return authService.login(request);
    }
}