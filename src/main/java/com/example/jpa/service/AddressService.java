package com.example.jpa.service;

import com.example.jpa.model.AddressEntity;
import com.example.jpa.model.dtos.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<AddressDTO> findAddressEntitiesByCity(String city);

    Optional<AddressDTO> findFirstByCountry(String country);

    List<AddressDTO> getAllAddresses();

    AddressDTO addAddress(AddressDTO addressDTO);

    void deleteAddress(Long id);

}
