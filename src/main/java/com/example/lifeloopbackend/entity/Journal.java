package com.example.lifeloopbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "journals")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;

    @Column(length = 5000)
    private String content;

    private String date;

    private String mood;

    @ManyToOne
    private User user;

}
