package demo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		   
	 Account account = ctx.getBean(Account.class);
	System.out.println("Balance :" + account.getAmount());
		 
	//	 Customer customer = ctx.getBean(Customer.class);
	//	 System.out.println("Customer name "+ customer.getName());
		}

}
