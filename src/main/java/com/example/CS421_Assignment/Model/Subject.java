package com.example.CS421_Assignment.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int academicyear;

    public Subject(){}

    public Subject(String name, int academicyear) {
        this.name = name;
        this.academicyear = academicyear;
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

    public int getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(int academicyear) {
        this.academicyear = academicyear;
    }
}
