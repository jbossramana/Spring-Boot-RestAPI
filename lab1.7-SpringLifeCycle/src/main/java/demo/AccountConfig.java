package demo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "demo")
public class AccountConfig {

@Bean("account")
public Account getAccount()
{
	return new Account();
	
}

@Bean
public Customer getCustomer()
{
	return new Customer();
}
}

