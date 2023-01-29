package com.example.jpa.repository;

import com.example.jpa.model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {


    List<AddressEntity> findAddressEntitiesByCity(String city);

    Optional<AddressEntity> findFirstByCountry(String country);


}
