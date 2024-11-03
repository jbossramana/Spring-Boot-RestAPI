package demo;

import org.springframework.context.annotation.*;

@Configuration
public class AccountConfig {

@Bean
public Account getAccount()
{
	return new Account(1000);
	
}

}

