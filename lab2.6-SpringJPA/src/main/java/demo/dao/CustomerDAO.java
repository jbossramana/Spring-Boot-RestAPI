package demo.dao;

import java.util.List;

public interface CustomerDAO {
	 
	 public Customer addCustomer(Customer customer);
	 public Customer updateCustomer(Customer customer);
	 public void deleteCustomer(long customerId);
	 public Customer getCustomer(long customerId);
	 public List<Customer> getCustomers();

	}