package com.example.jpa.repository;

import com.example.jpa.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {


    List<StudentEntity> findStudentEntitiesByFirstName(String firstName);

    List<StudentEntity> findStudentEntitiesByAddressEntity_City(String city);

}
