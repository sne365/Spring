package com.appdev.ws.appdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.ws.appdev.model.Address;


public interface AddressRepository extends JpaRepository<Address, Long>  {

}
