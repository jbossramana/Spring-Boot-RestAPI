package demo;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:payment.properties")
@Import(PaymentConfig.class)
@Profile("prod")
public class AccountProdConfig {
	
	
   @Bean 
   public Account getAccount(){
      return new Account(10000);
   }
}