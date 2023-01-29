package com.example.jpa.service;

import com.example.jpa.model.AddressEntity;
import com.example.jpa.model.StudentEntity;
import com.example.jpa.model.dtos.StudentDTO;
import com.example.jpa.model.mappers.StudentMapper;
import com.example.jpa.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public List<StudentDTO> findStudentEntitiesByFirstName(String firstName) {
        return studentRepository.findStudentEntitiesByFirstName(firstName).stream()
                .map(studentMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<StudentDTO> findStudentEntitiesByAddressEntityCity(String city) {
        return studentRepository.findStudentEntitiesByAddressEntity_City(city).stream()
                .map(studentMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO addStudent(StudentDTO studentDTO) {
        StudentEntity student = studentRepository.save(studentMapper.mapToEntity(studentDTO));
        return studentMapper.mapToDTO(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
