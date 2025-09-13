package demo.dao;

import demo.entity.Employee;
import java.util.List;

public interface EmployeeDao {
    void save(Employee employee);
    List<Employee> findAll();
}
