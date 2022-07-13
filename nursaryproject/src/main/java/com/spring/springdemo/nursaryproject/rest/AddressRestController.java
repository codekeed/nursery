package com.spring.springdemo.nursaryproject.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.springdemo.nursaryproject.entity.Address;
import com.spring.springdemo.nursaryproject.service.AddressService;

@RestController
public class AddressRestController {
	private  AddressService addressService;

	@Autowired
	public AddressRestController(AddressService addressService) {
		this.addressService = addressService;
	}


	@GetMapping("/address")
	public List<Address> viewAllAddress() {
		return addressService.viewAllAddress();
	}


	@GetMapping("/address/{addressId}")
	public Address getAddress(@PathVariable int addressId) {
		
		Address theAddress = addressService.viewAddress(addressId);
		
		if (theAddress == null) {
			throw new RuntimeException("Address id not found - " + addressId);
		}
		
		return theAddress;
	}

	

	@PostMapping("/address")
	public Address addAddress(@RequestBody Address address) {
		
		address.setAddressId(0);
		
		addressService.addAddress(address);
		
		return address;
	}

	@PutMapping("/address")
	public Address updateAddress(@RequestBody Address address) {
		
		addressService.updateAddress(address);
		
		return address;
	}
	
	@DeleteMapping("/address/{addressId}")
	public String deleteAddress(@PathVariable int addressId) {
		
		Address tempAddress = addressService.viewAddress(addressId);
		
		// throw exception if null
		
		if (tempAddress == null) {
			throw new RuntimeException("Address id not found - " + addressId);
		}
		
		addressService.deleteAddress(addressId);
		
		return "Deleted Address id - " + addressId;
		
	   }
}
