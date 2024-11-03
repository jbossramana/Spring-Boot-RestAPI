package demo;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
public class AccountConfig {

@Bean("account")
public Account getAccount()
{
	return new Account();
	
}

}

