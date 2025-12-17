package com.example.demo.entity;

import jakarta.presistence.Entity;
import jakarta.presistence.Id;

@Entity
public class StudentEntity {

    @Id
    private Long id;
    private String name;
    private String email;
    private float cgpa;

}