package com.example.lifeloopbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DashboardResponse {

    private long totalTasks;

    private long totalEvents;

    private long totalJournals;

    private long totalMoodLogs;

    private long totalExpenses;

    private String latestMood;

    private int productivityScore;
}