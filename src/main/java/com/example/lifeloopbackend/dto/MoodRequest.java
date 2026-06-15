package com.example.lifeloopbackend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MoodRequest {

    private String mood;

    private String note;

    private String date;

}
