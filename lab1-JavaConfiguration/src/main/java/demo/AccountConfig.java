package demo;

import org.springframework.context.annotation.*;

@Configuration
@Import(PaymentConfig.class)
@Profile("dev")
public class AccountConfig {
	
	
   @Bean 
   @Scope("singleton")
   public Account getAccount(){
      return new Account(500);
   }
}

