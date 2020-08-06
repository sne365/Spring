package com.appdev.ws.appdev.model;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Address extends AbstractPersistable<Long>{
 private String city;
 private String state;
 private String country;
 
 private transient Long userId;
 
 public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
@ManyToOne
 @JoinColumn(name="userid")
 private User user;
 
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
}
