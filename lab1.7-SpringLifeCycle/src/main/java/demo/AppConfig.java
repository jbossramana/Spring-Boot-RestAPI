package demo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "demo")
public class AppConfig {

@Bean("account")
@Scope("singleton")
public Account getAccount()
{
	return new Account();
	
}

@Bean("customer")
@Scope("prototype")
public Customer getCustomer()
{
	return new Customer();
}
}

