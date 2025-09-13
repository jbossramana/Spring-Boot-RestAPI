package demo.web.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;


import demo.web.SpringBootDemoApplication;
import demo.web.model.Employee;
import demo.web.model.Employees;



@SpringBootTest(classes = SpringBootDemoApplication.class, 
		webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerIntegrationTests 
{
	@org.springframework.boot.test.web.server.LocalServerPort
	private int port;


	
	@Autowired
	private TestRestTemplate restTemplate;

	@Sql({ "classpath:schema.sql", "classpath:data.sql" })
	@Test
	public void testAllEmployees() 
	{
		assertTrue(
				this.restTemplate
					.getForObject("http://localhost:" + port + "/employees", Employees.class)
					.getEmployeeList().size() == 2);
	}

	@Test
	public void testAddEmployee() {
		Employee employee = new Employee("venkata", "ramana", "ramana@demo.com");
		ResponseEntity<String> responseEntity = this.restTemplate
			.postForEntity("http://localhost:" + port + "/employees", employee, String.class);
		assertEquals(201, responseEntity.getStatusCodeValue());
	}
	
	
	
}
