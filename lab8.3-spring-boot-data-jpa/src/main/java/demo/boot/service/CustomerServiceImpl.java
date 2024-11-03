package demo.boot.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import demo.boot.dao.Customer;
import demo.boot.dao.ICustomerDAO;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

 @Autowired
 private ICustomerDAO customerDAO;
 

 public Customer addCustomer(String customerName, String country) {
	 
	
        System.out.println("Cusomer Service create invoked:"+customerName);
        Customer customer = new Customer();
        customer.setCountry(country);
        customer.setCustomerName(customerName);
       // customer.setCreatedDate(new Date());
     //   customer.setUpdateDate(new Date());
       customer = customerDAO.save(customer);
       return customer;
 }

 public Optional<Customer> getCustomer(long customerId) {
       return customerDAO.findById(customerId);
 }
 public List<Customer> getAllCustomers() {
     return (List<Customer>) customerDAO.findAll();
 }
}
