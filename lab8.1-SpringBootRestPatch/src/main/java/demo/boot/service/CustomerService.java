
package demo.boot.service;

import java.util.Optional;

import demo.boot.model.Customer;



public interface CustomerService {

    Customer createCustomer(Customer customer);

    Optional<Customer> findCustomer(String id);

    void updateCustomer(Customer customer);
}
