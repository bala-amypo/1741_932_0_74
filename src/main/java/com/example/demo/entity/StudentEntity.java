package com.example.demo.entity;

import jakarta.presistence.Entity;
import jakarta.presistence.GeneratedValue;
import jakarta.presistence.GenerationType;
import jakarta.presistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

}