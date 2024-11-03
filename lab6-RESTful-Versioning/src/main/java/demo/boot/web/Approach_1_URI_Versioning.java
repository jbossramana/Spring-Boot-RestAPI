package demo.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.model.CustomerV1;
import demo.boot.model.CustomerV2;
import demo.boot.model.Name;

// http://localhost:8080/v1/customer
// http://localhost:8080/v2/customer

@RestController
public class Approach_1_URI_Versioning {

	@GetMapping("/v1/customer")
	public CustomerV1  customerV1()
	{
	      return new CustomerV1("maharshi");	
	}
	
	@GetMapping("/v2/customer")
	public CustomerV2  customerV2()
	{
	     return new CustomerV2 (new Name("Aditya", "Ram"));
   }
}
