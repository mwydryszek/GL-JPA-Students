package com.example.jpa.service;

import com.example.jpa.model.AddressEntity;
import com.example.jpa.model.dtos.AddressDTO;
import com.example.jpa.model.mappers.AddressMapper;
import com.example.jpa.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    @Override
    public List<AddressDTO> findAddressEntitiesByCity(String city) {
        return addressRepository.findAddressEntitiesByCity(city).stream()
                .map(addressMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AddressDTO> findFirstByCountry(String country) {
        return addressRepository.findFirstByCountry(country).stream()
                .map(addressMapper::mapToDTO)
                .findFirst();
    }

    @Override
    public List<AddressDTO> getAllAddresses() {
        return addressRepository.findAll().stream()
                .map(addressMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AddressDTO addAddress(AddressDTO addressDTO) {
        AddressEntity address = addressRepository.save(addressMapper.mapToEntity(addressDTO));
        return addressMapper.mapToDTO(address);
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
