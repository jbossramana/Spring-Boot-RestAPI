package demo;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.dao.Employee;
import demo.dao.EmployeeDAO;




public class Client {


	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);

		 EmployeeDAO employeeDao = ctx.getBean(EmployeeDAO.class);
		 System.out.println("Total employees: " + employeeDao.getCountOfEmployees());

		 Employee employee = new Employee();
		 employee.setId(3);
		 employee.setFirstName("mani");
		 employee.setLastName("Gopal");
		 employee.setAddress("Chennai");
		 employeeDao.addEmplyee(employee);
		 
		 Employee employee3 = employeeDao.getEmployee(3);
		 
		// employeeDao.addEmplyeeUsingSimpelJdbcInsert(employee);
		 System.out.println("Total employees: " + employeeDao.getCountOfEmployees());
		 
		 System.out.println("Get Employee by id: "+ employeeDao.getEmployee(3));
		 
		 List<Employee> employees =    employeeDao.getAllEmployees();
		 
		 System.out.println("Get Employee by UsingMapSqlParameterSource : "+ employeeDao.getEmployeeUsingMapSqlParameterSource());
		ctx.registerShutdownHook();
	}

}
