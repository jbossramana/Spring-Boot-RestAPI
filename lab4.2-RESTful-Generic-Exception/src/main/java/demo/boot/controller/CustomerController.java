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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import demo.boot.exception.CustomerNotFoundException;
import demo.boot.model.Customer;
import demo.boot.service.CustomerBeanService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerBeanService  service;
	
	@GetMapping
	public List<Customer> getAllCustomers()
	{
		return service.findAll();
	}
	
//Exception handling	
@GetMapping("{name}")
public Customer  getCustomer(@PathVariable  String name)
{
  Customer customer = service.findCustomer(name);
  
  if(customer == null) throw new CustomerNotFoundException("name :"+name+",not found");
return customer;
  
}


@DeleteMapping("{name}")
public void  deleteCustomer(@PathVariable  String name)
{
  Customer customer = service.deleteByName(name);
  
  if(customer == null) throw new CustomerNotFoundException("name :"+name);

  
}



//http response status comes as 200
@PostMapping
public void createCustomer(@RequestBody Customer customer)
{
	Customer cust = service.saveCustomer(customer);
}

// check the staus - it is 201
// check the headers -> Location 
@PostMapping("status")
public ResponseEntity<Object> createCustomerWithSatus(@RequestBody Customer customer)
{
	Customer savedCustomer = service.saveCustomer(customer);
	
	URI   uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{name}").
            buildAndExpand(savedCustomer.getName()).toUri();

    return ResponseEntity.created(uri).build();

}

}
