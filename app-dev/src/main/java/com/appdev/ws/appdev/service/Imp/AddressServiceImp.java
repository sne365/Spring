package com.appdev.ws.appdev.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.ws.appdev.model.Address;
import com.appdev.ws.appdev.repository.AddressRepository;
import com.appdev.ws.appdev.repository.UserRepository;
import com.appdev.ws.appdev.service.AddressService;

@Service
public class AddressServiceImp implements AddressService {
private AddressRepository addressRepository;
private UserRepository userRepository;

	
	@Autowired
	public AddressServiceImp(AddressRepository addressRepository, UserRepository userRepository) {
		this.userRepository=userRepository;
		this.addressRepository = addressRepository;
  }


	@Override
	public List<Address> addressList(){
		return addressRepository.findAll();
	}


	@Override
	public Address findById(Long id) {
		// TODO Auto-generated method stub
		return addressRepository.findById(id).orElse(null);
	}


	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		address.setUser(userRepository.findById(address.getUserId()).orElse(null));
		return addressRepository.save(address);
	}


	@Override
	public String deleteAddress(Long id) {
		// TODO Auto-generated method stub
		addressRepository.deleteById(id);
		return "{Message: 'Address deleted sucessfully'}";
	}

}
