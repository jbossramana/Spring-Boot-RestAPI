package demo.boot.service;

import java.util.List;
import java.util.Optional;

import demo.boot.dao.Customer;

public interface CustomerService {
	 
	 public Customer addCustomer(String customerName, String country);
	 public Optional<Customer> getCustomer(long customerId);
	 public List<Customer> getAllCustomers();
	}