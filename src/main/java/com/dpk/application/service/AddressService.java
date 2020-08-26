package com.dpk.application.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.dpk.application.model.Address;

@Service
public class AddressService {
	
	//Using local hashmap to keep address/ in actual implementation address should be stored in DB.
	Map<Integer, Address> addressMap = new HashMap<Integer, Address>();
	
	public Address getAddress(Integer id) {
		// Logic to query an address for persistent layer and return
		// for Demo purpose return a dummy address
		return addressMap.getOrDefault(id, Address.getADummyAddress(id));
		
	}

	public List<Address> getAddresses() {
		
		// Logic to query all address for persistent layer and return
		// for Demo purpose return a dummy address list
		// return Address.getADummyAddressList();
		return new ArrayList<Address>(addressMap.values());
	}

	public void save(Address address) {
		addressMap.put(address.getId(), address);
		
	}
}
