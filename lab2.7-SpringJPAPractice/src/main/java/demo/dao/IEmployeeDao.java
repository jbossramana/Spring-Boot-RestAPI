package demo.dao;

public interface IEmployeeDao {

	void addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	Employee getEmployeeById(long id);
}
