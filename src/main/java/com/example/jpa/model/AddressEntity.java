package com.example.jpa.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Table(name = "ADDRESS")
public class AddressEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 100)
    private String country;

    @Column(nullable = false, length = 100)
    private String city;

    @Column(nullable = false, length = 120)
    private String street;

    @Column(nullable = false)
    private Integer houseNumber;

    @OneToMany(mappedBy = "addressEntity")
    private List<StudentEntity> studentEntityList = new ArrayList<>();

}
