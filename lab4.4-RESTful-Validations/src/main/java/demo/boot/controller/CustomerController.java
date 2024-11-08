package demo.boot.controller;

import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import demo.boot.exception.CustomerNotFoundException;
import demo.boot.model.Customer;
import demo.boot.service.CustomerBeanService;
import jakarta.validation.Valid;

@RestController
public class CustomerController {

	@Autowired
	private CustomerBeanService  service;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return service.findAll();
	}
	
//Exception handling	
@GetMapping("/customers/{name}")
public Customer  getCustomer(@PathVariable  String name)
{
  Customer customer = service.findCustomer(name);
  
  if(customer == null) throw new CustomerNotFoundException("name :"+name);
return customer;
  
}


@DeleteMapping("/customers/{name}")
public void  deleteCustomer(@Valid @PathVariable  String name)
{
  Customer customer = service.deleteByName(name);
  
  if(customer == null) throw new CustomerNotFoundException("name :"+name);

  
}

// pass a name with 2 characters and see 400 (Bad Request) error
@PostMapping("customersWithStatus")
public ResponseEntity<Object> createCustomerWithSatus(@Valid @RequestBody Customer customer)
{
	Customer savedCustomer = service.saveCustomer(customer);
	
	URI   uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{name}").
            buildAndExpand(savedCustomer.getName()).toUri();

    return ResponseEntity.created(uri).build();

}

}
