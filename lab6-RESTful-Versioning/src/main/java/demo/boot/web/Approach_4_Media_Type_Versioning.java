package demo.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.model.CustomerV1;
import demo.boot.model.CustomerV2;
import demo.boot.model.Name;

//http://localhost:8080/customer     headers[Accept=application/vnd.company.app-v1+json]
//http://localhost:8080/customer     headers[Accept=application/vnd.company.app-v2+json]

@RestController
public class Approach_4_Media_Type_Versioning {

	@GetMapping(value="customer",produces = "application/vnd.company.app-v1+json")
	public CustomerV1  customerV1()
	{
	      return new CustomerV1("maharshi");	
	}
	
	@GetMapping(value="customer",produces = "application/vnd.company.app-v2+json")
	public CustomerV2  customerV2()
	{
	     return new CustomerV2 (new Name("Aditya", "Ram"));
   }
}
