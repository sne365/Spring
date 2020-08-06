package com.appdev.ws.appdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.ws.appdev.model.Address;
import com.appdev.ws.appdev.service.AddressService;


@RestController
@RequestMapping("/address")
	public class AddressController {
	

	private AddressService addressService;
	
	@Autowired
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}

	
	@RequestMapping("/list")
	public List<Address> userList(){
	return addressService.addressList();	
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteAddress(@PathVariable Long id){
		
		return addressService.deleteAddress(id);
	}
	
	@RequestMapping("/add")
	public Address addAddress(@RequestBody Address address){
		System.out.print("hi");
		return addressService.addAddress(address);
		
	}
	
	@RequestMapping("/list/{id}")
	public Address findOne(@PathVariable Long id){
		return addressService.findById(id);
	}
}
