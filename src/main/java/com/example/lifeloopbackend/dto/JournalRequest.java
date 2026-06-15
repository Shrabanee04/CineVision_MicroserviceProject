package com.example.lifeloopbackend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class JournalRequest {

    private String title;

    private String content;

    private String date;

    private String mood;

}
