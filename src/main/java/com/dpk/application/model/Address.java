package com.dpk.application.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;

@Component
public class Address {
	
	@ApiModelProperty(notes = "Unique address id" , required = true)
	private Integer id;
	
	@ApiModelProperty(notes = "Street Number, Street name" , required = true)
	private String addressLine1;
	
	@ApiModelProperty(notes = "Apt Number/House Number/Suit")
	private String addressLine2;
	
	@ApiModelProperty(notes = "City name")
	private String city;
	
	@ApiModelProperty(notes = "State")
	private String state;
	
	@ApiModelProperty(notes = "Zip code" , required = true)
	private String zip;

	
	
	public Address() {
		super();
	}

	public Address(Integer id, String addressLine1, String addressLine2, String city, String state, String zip) {
		super();
		this.id = id;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	public static Address getADummyAddress(Integer id) {
		return new Address(id, "Carmel Dr", "Apt 5E", "Carmel", "IN", "46033");
	}
	
	
	public static List<Address> getADummyAddressList() {
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(new Address(1, "Carmel Dr", "Apt 5E", "Carmel", "IN", "46033"));
		addresses.add(new Address(2, "Woodland Dr", "Suit 105", "Indianapolis", "IN", "46277"));
		return addresses;
	}

}
