package com.genspark.InfyBank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.genspark.InfyBank.model.Customer;

@Service
public class CustomerService implements CustomerServiceInt{
	
   private List<Customer> customers =new ArrayList<Customer>();

	@Override
	public List<Customer> getAllCustomerDetails() {
		return customers;
	}

	@Override
	public Customer getCustomerDetails(Integer customerId) {
		for (Customer customer : customers) {
			if(customer.getCustomerId()==customerId) return customer;
		}
		return null;
	}

	@Override
	public void addCustomer(Customer customer) {
		customers.add(customer);
		System.out.println(customers.toString());
		System.out.println(customer.toString());
	}

	@Override
	public void updateCustomer(Integer customerId, Customer customer) {
		for (Customer c : customers) {
			if(c.getCustomerId()==customerId) { 
				int index=customers.indexOf(c);
				customers.set(index, customer);
			}
		}
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		for (Customer customer : customers) {
			if(customer.getCustomerId()==customerId) customers.remove(customer);
		}
	}
}
