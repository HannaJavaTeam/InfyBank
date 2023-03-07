package com.genspark.InfyBank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.genspark.InfyBank.model.Customer;
import com.genspark.InfyBank.service.CustomerService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomerDetails(){
		return customerService.getAllCustomerDetails();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomerDetails(@PathParam("customerId") Integer customerId) {
		return customerService.getCustomerDetails(customerId);
	}
	
	@PostMapping("/customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		
	}
	
	@PutMapping("/customers/{customerId}")
	public void updateCustomer(Integer customerId,Customer customer) {	
		customerService.updateCustomer(customerId, customer);
	}
	
	@DeleteMapping("/customers/{customerId}")
	public void deleteCustomer(Integer customerId,Customer customer) {	
		customerService.deleteCustomer(customerId);
	}
}
