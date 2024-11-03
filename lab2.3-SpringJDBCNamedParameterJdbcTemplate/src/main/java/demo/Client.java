package demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.dao.Employee;
import demo.dao.EmployeeDAO;



public class Client {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		 EmployeeDAO dao=(EmployeeDAO)ctx.getBean(EmployeeDAO.class);  
		    Employee emp = new Employee();
		    emp.setEmpName("surya");
		    emp.setAge(25);
		    int status = dao.save(emp);  
		    System.out.println(status);  
		    // For update
		    emp.setEmpId(8);
		    emp.setAge(50);
		    dao.update(emp);
		        
		    // For delete
		//    dao.deleteEmpById(10);
	
	}

}
