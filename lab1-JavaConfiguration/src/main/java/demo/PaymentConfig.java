package demo;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
//@PropertySource("classpath:payment.properties")
public class PaymentConfig {
	
   @Bean 
   public Payment getPayment(){
      return new Payment();
   }
}