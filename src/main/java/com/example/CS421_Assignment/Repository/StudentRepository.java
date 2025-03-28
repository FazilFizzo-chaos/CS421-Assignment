package com.example.CS421_Assignment.Repository;

import com.example.CS421_Assignment.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
