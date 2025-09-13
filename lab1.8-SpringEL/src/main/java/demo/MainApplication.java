package demo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		   
		 EmployeeSalary employeeSalary = ctx.getBean(EmployeeSalary.class);
		 System.out.println(employeeSalary.getEmployee1());
		 System.out.println(employeeSalary.getEmployee2());
		 System.out.println(employeeSalary.getCompany());
		 System.out.println(employeeSalary.getJavaHome());
		 System.out.println(employeeSalary.getUserDir());
		 System.out.println(employeeSalary.getEmployeeAge());
		 System.out.println(employeeSalary.getEmployeeAgeTwo());
		 System.out.println(employeeSalary.getAgeWithDefaultValue());
		}

}
