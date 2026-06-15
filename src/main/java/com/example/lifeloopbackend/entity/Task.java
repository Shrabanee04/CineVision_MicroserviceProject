package com.example.lifeloopbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String priority;

    private String status;

    private String deadline;

    private String category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}