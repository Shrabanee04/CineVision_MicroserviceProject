package com.example.lifeloopbackend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EventRequest {

    private String title;

    private String description;

    private String date;

    private String time;

    private String type;
}
