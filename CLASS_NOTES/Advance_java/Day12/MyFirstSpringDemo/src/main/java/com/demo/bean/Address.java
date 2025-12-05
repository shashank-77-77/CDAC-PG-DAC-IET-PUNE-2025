package com.demo.bean;

public class Address {
	private String street;
	private String city;
	private String pincode;
	public Address() {
		super();
		System.out.println("in Address default constuctor");
	}
	public Address(String street, String city, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		System.out.println("in Address parametrized constuctor");
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street; 
		System.out.println("in Address setstreet");
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		System.out.println("in Address setcity");
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
		System.out.println("in Address setpincode");
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
