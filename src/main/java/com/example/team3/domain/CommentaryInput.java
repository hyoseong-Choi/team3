package com.example.team3.entity;

import lombok.Data;

import java.time.LocalTime;

@Data
public class CommentaryInput {
    private LocalTime time;
    private String player;
    private String location;
    private String action;
}
