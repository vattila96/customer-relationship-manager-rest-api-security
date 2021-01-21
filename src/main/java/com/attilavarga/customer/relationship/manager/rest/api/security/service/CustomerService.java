package com.attilavarga.customer.relationship.manager.rest.api.security.service;

import java.util.List;
import com.attilavarga.customer.relationship.manager.rest.api.security.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int id);
	public void deleteCustomer(int id);
}
