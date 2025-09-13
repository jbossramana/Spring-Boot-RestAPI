package demo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Main
{
	 static Logger log = Logger.getLogger(Main.class.getName());
	 
   public static void main(String[] args)
      throws Exception
   {
	   
	   

    ApplicationContext ctx = new ClassPathXmlApplicationContext("demo/ApplicationContext.xml");
    
    Account account  = (Account) ctx.getBean("account");
    System.out.println("Amount is : "+ account.getAmt());
    System.out.println("Account type :" + account.getType());
    
    Customer  customer = (Customer) ctx.getBean("customer");
    System.out.println("customer name: " + customer.getName());
   
   }
   
}
