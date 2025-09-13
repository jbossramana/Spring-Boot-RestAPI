package demo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {
	 public static void main(String[] args) {
	        AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        PaymentService service = context.getBean(PaymentService.class);
	        service.processPayment();

	        
	        CustomerService custService = context.getBean(CustomerService.class);
	        custService.getCustomer();
	        
	        context.close();
	    }
}
