package com.example.jpa.model.mappers;


import com.example.jpa.model.StudentEntity;
import com.example.jpa.model.dtos.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentEntity mapToEntity(StudentDTO studentDTO);
    StudentDTO mapToDTO(StudentEntity student);

}
