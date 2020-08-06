package com.appdev.ws.appdev.service;

import java.util.List;

import com.appdev.ws.appdev.model.Address;


public interface AddressService {

	List<Address> addressList();
	
	Address findById(Long id);
	
    String deleteAddress(Long id);

	Address addAddress(Address address);
}
