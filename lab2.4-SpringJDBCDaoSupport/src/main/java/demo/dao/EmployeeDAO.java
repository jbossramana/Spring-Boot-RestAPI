package demo.dao;

public interface EmployeeDAO {
	 public int save(Employee employee);
	 
	 public void update(Employee employee);
	 
	 public void deleteEmpById(int empId);
	}