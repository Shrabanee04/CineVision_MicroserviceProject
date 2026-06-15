package com.example.lifeloopbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "moods")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Mood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String mood;

    private String note;

    private String date;

    @ManyToOne
    private User user;


}
