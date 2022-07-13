package com.spring.springdemo.nursaryproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.springdemo.nursaryproject.dao.AddressRepository;
import com.spring.springdemo.nursaryproject.entity.Address;


@Service
public class AddressServiceImpl implements AddressService {
	
	private AddressRepository addressRepository;

	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	@Override
	public List<Address> viewAllAddress() {
		return addressRepository.findAll();
	}
	
	@Override
	public Address viewAddress(int addressId) {
		Optional<Address> result = addressRepository.findById(addressId);
	
		Address theAddress = null;
	
		if (result.isPresent()) {
			theAddress = result.get();
		} else {
			// we didn't find the manufacturer
			throw new RuntimeException("Did not find Planter id - " + addressId);
		}
	
		return theAddress;
	}
	

   @Override
	public void addAddress(Address address) {
	   addressRepository.save(address);
	}
	
	@Override
	public void updateAddress(Address theAddress) {
		addressRepository.save(theAddress);
	}
	
	@Override
	public void deleteAddress(int addressId) {
		addressRepository.deleteById(addressId);
	}
	
}
