package com.example.CS421_Assignment.Repository;

import com.example.CS421_Assignment.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
