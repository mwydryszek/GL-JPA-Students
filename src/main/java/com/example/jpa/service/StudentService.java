package com.example.jpa.service;

import com.example.jpa.model.StudentEntity;
import com.example.jpa.model.dtos.AddressDTO;
import com.example.jpa.model.dtos.StudentDTO;

import java.util.List;

public interface StudentService {


    List<StudentDTO> findStudentEntitiesByFirstName(String firstName);

    List<StudentDTO> findStudentEntitiesByAddressEntityCity(String city);

    List<StudentDTO> getAllStudents();

    StudentDTO addStudent(StudentDTO studentDTO);

    void deleteStudent(Long id);

}
