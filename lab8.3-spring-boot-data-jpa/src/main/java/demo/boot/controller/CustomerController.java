package demo.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.dao.Customer;
import demo.boot.service.CustomerService;

@RestController
public class CustomerController {
	

	@Autowired
	CustomerService  customerService;
	
	@GetMapping
	public List<Customer> disp()
	{
	Customer acc = customerService.addCustomer("Ramana", "India");
	Customer accM = customerService.addCustomer("Maharshi", "India");
	List<Customer> list = customerService.getAllCustomers();
	
	for (Customer customer : list)
	{
		System.out.println("Customer name "+customer.getCustomerName());
		System.out.println("Customer Country :" + customer.getCountry());
		
	}

	return list;
	}
	
	

}
