package demo;



import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.dao.AccountEntity;
import demo.dao.EmployeeEntity;
import demo.dao.IEmployeeDao;



public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfig.class);

		 IEmployeeDao employeeDao = ctx.getBean(IEmployeeDao.class);
		 
		 EmployeeEntity emp = new EmployeeEntity();
	      emp.setFirstName("Venkata");
	      emp.setLastName("Ramana");

	      // Create new Account object
	      AccountEntity acc = new AccountEntity();
	      acc.setAccountNumber("Saving Account");
	      emp.setAccount(acc);
	      
	      employeeDao.saveEmployee(emp);
	      
	      
	      EmployeeEntity  emp1 = employeeDao.getEmployeeById(1);
	       
	      System.out.println("Employee details :" + emp1.getFirstName());
	      System.out.println("Account details : " + emp1.getAccount().getAccountNumber());
	      
	      
	      
	      
	      
		
		}

}
