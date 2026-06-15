package com.example.lifeloopbackend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ExpenseRequest {

    private String title;

    private double amount;

    private String type;

    private String category;

    private String date;
}
