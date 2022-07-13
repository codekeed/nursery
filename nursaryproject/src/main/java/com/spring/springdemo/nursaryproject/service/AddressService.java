package com.spring.springdemo.nursaryproject.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.spring.springdemo.nursaryproject.entity.Address;

@Service
public interface AddressService {
	 
	public List<Address> viewAllAddress();
	  
    public Address viewAddress(int addressId);
	  
    public void addAddress(Address address);
	  
    public void updateAddress(Address address);
		
	public void deleteAddress(int addressId);
}
