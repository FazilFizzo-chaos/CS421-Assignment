package com.example.CS421_Assignment.Repository;

import com.example.CS421_Assignment.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByEnrolledProgram(String enrolledProgram);
}
