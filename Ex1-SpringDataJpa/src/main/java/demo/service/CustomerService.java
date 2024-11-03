package demo.service;

import java.util.List;
import java.util.Optional;

import demo.dao.Customer;

public interface CustomerService {
	 
	 public Customer addCustomer(String customerName, String country);
	 public Customer updateCustomer(long customerId,String customerName, String country);
	 public Optional<Customer> getCustomer(long customerId);
	 public List<Customer> getAllCustomers();
	}