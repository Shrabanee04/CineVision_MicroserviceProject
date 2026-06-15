package com.example.lifeloopbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="expenses")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;

    private double amount;

    private String type;

    private String category;

    private String date;

    @ManyToOne
    private User user;
}
