package demo.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.model.CustomerV1;
import demo.boot.model.CustomerV2;
import demo.boot.model.Name;

// http://localhost:8080/customer?version=1
// http://localhost:8080/customer?version=2

@RestController
public class Approach_2_Request_Parameter_Versioning {

	@GetMapping(value="customer",params = "version=1")
	public CustomerV1  customerV1()
	{
	      return new CustomerV1("maharshi");	
	}
	
	@GetMapping(value="customer",params = "version=2")
	public CustomerV2  customerV2()
	{
	     return new CustomerV2 (new Name("Aditya", "Ram"));
   }
}
