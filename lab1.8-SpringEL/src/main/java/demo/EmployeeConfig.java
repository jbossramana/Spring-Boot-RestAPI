package demo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class EmployeeConfig {

@Bean
public EmployeeSalary getEmployeeSalary()
{
	return new EmployeeSalary();
}
}

