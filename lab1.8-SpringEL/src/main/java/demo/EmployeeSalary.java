package demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;


public class EmployeeSalary {

	@Value("#{employeeSalaryHolder.salaryByemployees['employee1']}") 	
	Integer employee1;
	
	@Value("#{employeeSalaryHolder.salaryByemployees['employee2']}") 	
	Integer employee2;
	
	
	@Value("#{environment['employee.company'] }")
	String company;
	
	@Value ("#{systemProperties['java.home']}")
	private String javaHome;
	
	@Value ("#{systemProperties['user.dir']}")
	private String userDir;

	
	@Value ("#{${employee.age}}")
	 private Map<String, Integer> employeeAge;
	
	@Value ("#{${employee.age}.two}")
	private String employeeAgeTwo;
	
	
	@Value ("#{${employee.age}['five'] ?: 30}")
	 private Integer ageWithDefaultValue;
	
	
	public String getCompany() {
		return company;
	}


	public Integer getEmployee1() {
		return employee1;
	}
		

	public Integer getEmployee2() {
		return employee2;
	}


	public String getJavaHome() {
		return javaHome;
	}


	public String getUserDir() {
		return userDir;
	}


	public Map<String, Integer> getEmployeeAge() {
		return employeeAge;
	}




	public String getEmployeeAgeTwo() {
		return employeeAgeTwo;
	}



	public Integer getAgeWithDefaultValue() {
		return ageWithDefaultValue;
	}


	

	
	
		
}
