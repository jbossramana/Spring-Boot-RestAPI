package demo.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.model.CustomerV1;
import demo.boot.model.CustomerV2;
import demo.boot.model.Name;

//http://localhost:8080/customer     headers=[X-API-VERSION=1]
//http://localhost:8080/customer     headers=[X-API-VERSION=2]

@RestController
public class Approach_3_Custom_Headers_Versioning {

	@GetMapping(value="customer",headers = "X-API-VERSION=1")
	public CustomerV1  customerV1()
	{
	      return new CustomerV1("maharshi");	
	}
	
	@GetMapping(value="customer",headers = "X-API-VERSION=2")
	public CustomerV2  customerV2()
	{
	     return new CustomerV2 (new Name("Aditya", "Ram"));
   }
}
