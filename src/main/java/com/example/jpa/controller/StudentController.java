package com.example.jpa.controller;

import com.example.jpa.model.dtos.StudentDTO;
import com.example.jpa.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/find-Student-By-First-Name/{firstName}")
    public List<StudentDTO> findStudentEntitiesByFirstName(@PathVariable("firstName") String firstName) {
        return studentService.findStudentEntitiesByFirstName(firstName);
    }

    @GetMapping("/find-Student-By-City")
    public List<StudentDTO> findStudentEntitiesByAddressEntityCity(@RequestParam(name = "city") String city) {
        return studentService.findStudentEntitiesByAddressEntityCity(city);
    }

    @GetMapping("/all")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public StudentDTO addStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
    }

}
