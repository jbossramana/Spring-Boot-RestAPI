package demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import demo.dao.Customer;
import demo.dao.CustomerDAO;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

 @Autowired
 private CustomerDAO customerDAO;
 
 @Transactional(propagation = Propagation.REQUIRED)  // start a new tx, Tx1
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
 @Transactional
 public Customer updateCustomer(long customerId,String customerName, String country) {
 
      System.out.println("Cusomer Service Update invoked:"+customerName);
      Customer customer = new Customer();
      customer.setCustomerId(customerId);
      customer.setCountry(country);
      customer.setCustomerName(customerName);
    // customer.setUpdateDate(new Date());
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
