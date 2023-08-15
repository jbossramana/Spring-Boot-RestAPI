package demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("employeeSalaryHolder")
public class EmployeeSalaryHolder {
    private List<String> employees = new LinkedList<>();
    private Map<String, Integer> salaryByemployees = new HashMap<>();

    public EmployeeSalaryHolder() {
        employees.add("employee1");
        employees.add("employee2");
        employees.add("employee3");
        employees.add("employee4");

        salaryByemployees.put("employee1", 35000);
        salaryByemployees.put("employee2", 47000);
        salaryByemployees.put("employee3", 12000);
        salaryByemployees.put("employee4", 14000);
    }

	public List<String> getemployees() {
		return employees;
	}

	public void setemployees(List<String> employees) {
		this.employees = employees;
	}

	public Map<String, Integer> getSalaryByemployees() {
		return salaryByemployees;
	}

	public void setSalaryByemployees(Map<String, Integer> salaryByemployees) {
		this.salaryByemployees = salaryByemployees;
	}

    
}