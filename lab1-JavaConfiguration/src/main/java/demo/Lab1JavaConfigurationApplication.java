package demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Lab1JavaConfigurationApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		    ctx.getEnvironment().setActiveProfiles("prod");
		    ctx.register(AccountConfig.class, AccountProdConfig.class);
		    ctx.refresh();
		    
		   Account account = ctx.getBean(Account.class);
		   account.setAccType("Saving Account");
		   System.out.println(account.getAccType());
		   
		   System.out.println("Balance: "+ account.getBal());
		   
		   Payment payment = ctx.getBean(Payment.class);
		//   payment.setPaymentMode("Card");
		   System.out.println(payment.getPaymentMode());
		   
		   account.someMethod();
		}

}
