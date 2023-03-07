package com.genspark.InfyBank.service;

import java.util.List;

import com.genspark.InfyBank.model.Customer;

public interface CustomerServiceInt {
	List<Customer> getAllCustomerDetails();
	Customer getCustomerDetails(Integer customerId);
	void addCustomer(Customer customer);
	void updateCustomer(Integer customerId,Customer customer);
	void deleteCustomer(Integer customerId);
}
