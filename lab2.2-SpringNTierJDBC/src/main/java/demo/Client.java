package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.EmployeeService;


public class Client {

	/**
	 * @param args
	 */

	
	
	private static EmployeeService employeeService;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		String name = "Tom";
		employeeService =(EmployeeService) ctx.getBean("service1");
		String message = employeeService.hire(name);
		System.out.println( message);
		ctx.registerShutdownHook();
	}

}
