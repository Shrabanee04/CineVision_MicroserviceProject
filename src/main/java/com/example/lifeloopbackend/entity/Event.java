package com.example.lifeloopbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="events")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String date;

    private String time;

    private String type;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}