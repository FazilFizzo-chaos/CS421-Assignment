package com.example.CS421_Assignment.Controller;

import com.example.CS421_Assignment.Model.Subject;
import com.example.CS421_Assignment.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }
}
