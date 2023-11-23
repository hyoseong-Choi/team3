package com.example.team3.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Commentary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = )
    private String commentary;
}
