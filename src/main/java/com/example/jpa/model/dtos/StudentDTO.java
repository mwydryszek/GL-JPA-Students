package com.example.jpa.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class StudentDTO {

    private Long id;
    private String firstName;
    private String lastName;

}
