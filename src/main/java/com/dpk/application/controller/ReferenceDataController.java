package com.dpk.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dpk.application.model.Address;
import com.dpk.application.service.AddressService;

@RestController
public class ReferenceDataController {
	
	@Autowired
	private AddressService addressService;

	@GetMapping("/address/{id}")
	public Address getAddress(@PathVariable Integer id) {
		return addressService.getAddress(id);
	}
	
	
	@GetMapping("/address/all")
	public List<Address> getAllAddresses() {
		return addressService.getAddresses();
	}
	
	
	@PostMapping(value = "/address/add")
    public ResponseEntity<String> saveProduct(@RequestBody Address address){
		addressService.save(address);
        return new ResponseEntity<String>("Address saved successfully", HttpStatus.OK);
    }

}
