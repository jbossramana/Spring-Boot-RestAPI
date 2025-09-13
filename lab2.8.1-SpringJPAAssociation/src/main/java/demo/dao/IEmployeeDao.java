package demo.dao;

public interface IEmployeeDao {

	public void saveEmployee(EmployeeEntity employeeEntity);
	public EmployeeEntity getEmployeeById(Integer id);
}
