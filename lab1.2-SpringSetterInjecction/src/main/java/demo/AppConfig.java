package demo;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

@Bean(name = "account")
@Scope("singleton")
public Account getAccount()
{
	return new Account();
	
}

@Bean("customer")
public Customer getCustomer()
{
	return new Customer();
}
}

