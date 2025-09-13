package demo.service;

import java.util.List;

import demo.dao.Customer;

public interface CustomerService {
	 
	 public Customer addCustomer(String customerName, String country);
	 public Customer updateCustomer(long customerId,String customerName, String country);
	 public Customer getCustomer(long customerId);
	 public List<Customer> getAllCustomers();
	}