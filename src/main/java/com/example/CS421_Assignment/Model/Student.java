package com.example.CS421_Assignment.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String enrolledprogram;

    public Student(){}

    public Student(String name, String enrolledprogram) {
        this.name = name;
        this.enrolledprogram = enrolledprogram;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrolledprogram() {
        return enrolledprogram;
    }

    public void setEnrolledprogram(String enrolledprogram) {
        this.enrolledprogram = enrolledprogram;
    }
}
