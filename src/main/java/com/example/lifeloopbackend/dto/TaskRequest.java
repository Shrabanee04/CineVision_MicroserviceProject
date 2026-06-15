package com.example.lifeloopbackend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TaskRequest {

    private String title;

    private String description;

    private String priority;

    private String deadline;

    private String category;

}