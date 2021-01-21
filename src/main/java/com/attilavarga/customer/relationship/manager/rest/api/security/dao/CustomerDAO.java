package com.attilavarga.customer.relationship.manager.rest.api.security.dao;

import java.util.List;
import com.attilavarga.customer.relationship.manager.rest.api.security.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int id);
	public void deleteCustomer(int id);
}
