package com.example.CS421_Assignment.Controller;

import com.example.CS421_Assignment.Model.Student;
import com.example.CS421_Assignment.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @GetMapping("/students/{enrolledProgram}")
    public List<Student> getStudentByEnrolledProgram(@RequestParam String enrolledProgram) {
        return studentRepository.findByEnrolledProgram(enrolledProgram);
    }
}
