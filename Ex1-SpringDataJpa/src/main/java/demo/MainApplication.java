package demo;



import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.dao.Customer;
import demo.service.CustomerService;






public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		   
		CustomerService customerService = ctx.getBean(CustomerService.class);
		Customer acc = customerService.addCustomer("Ramana", "India");
		Customer accM = customerService.addCustomer("Maharshi", "India");
		List<Customer> list = customerService.getAllCustomers();
		
		for (Customer customer : list)
		{
			System.out.println("Customer name "+customer.getCustomerName());
			System.out.println("Customer Country :" + customer.getCountry());
			
		}
		
		Customer acc2 = customerService.updateCustomer(1, "Rama", "India");
		
		List<Customer> list2 = customerService.getAllCustomers();
		
		for (Customer customer : list2)
		{
			System.out.println("Customer name "+customer.getCustomerName());
			System.out.println("Customer Country :" + customer.getCountry());
			
		}
		
		
		
		}

}
