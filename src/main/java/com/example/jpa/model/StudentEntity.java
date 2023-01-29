package com.example.jpa.model;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Table(name = "STUDENT")
public class StudentEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @ManyToOne
    @JoinColumn(name="address_id", referencedColumnName = "id")
    private AddressEntity addressEntity;

}
