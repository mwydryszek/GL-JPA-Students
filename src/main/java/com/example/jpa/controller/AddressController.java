package com.example.jpa.controller;

import com.example.jpa.model.dtos.AddressDTO;
import com.example.jpa.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;


    @GetMapping("/find-Address-By-City")
    public List<AddressDTO> findAddressEntitiesByCity(@RequestParam(name="city") String city) {
        return addressService.findAddressEntitiesByCity(city);
    }

    @GetMapping("/find-First-By-Country/{country}")
    public Optional<AddressDTO> findFirstByCountry(@PathVariable("country") String country) {
        return addressService.findFirstByCountry(country);
    }

    @GetMapping("/all")
    public List<AddressDTO> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping
    public AddressDTO addAddress(@RequestBody AddressDTO addressDTO) {
        return addressService.addAddress(addressDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable("id") Long id) {
        addressService.deleteAddress(id);
    }

}
