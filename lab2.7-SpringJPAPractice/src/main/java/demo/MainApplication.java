package demo;



import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.dao.Employee;
import demo.dao.IEmployeeDao;



public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		   
	   IEmployeeDao  employeeDao = ctx.getBean(IEmployeeDao.class);
	   
	   Employee employee = new Employee();
	   employee.setName("Ramana");
	   employee.setSal(90000);
	   
	  employeeDao.addEmployee(employee);
	  employee.setSal(80000);
		
	   employeeDao.updateEmployee(employee);
		
		}

}
