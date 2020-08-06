package com.appdev.ws.appdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.ws.appdev.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


}