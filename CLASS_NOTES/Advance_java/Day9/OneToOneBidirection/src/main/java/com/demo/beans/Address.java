package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address1")
public class Address {
	@Id
	@GeneratedValue
   private int aid;
   private String street;
   private String city;
   private String pincode;
   @OneToOne(mappedBy="addr",fetch=FetchType.LAZY)  //mappedBy will not add foreign key
   private MyUser user1;
   
public Address() {
	super();
}


public Address(int aid, String street, String city, String pincode, MyUser user1) {
	super();
	this.aid = aid;
	this.street = street;
	this.city = city;
	this.pincode = pincode;
	this.user1 = user1;
}



public MyUser getUser1() {
	return user1;
}


public void setUser1(MyUser user1) {
	this.user1 = user1;
}


public Address(String street, String city, String pincode) {
	super();
	this.street = street;
	this.city = city;
	this.pincode = pincode;
	this.user1 = null;
}


public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}


@Override
public String toString() {
	return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", pincode=" + pincode  
			+ "]";
}

   
}
