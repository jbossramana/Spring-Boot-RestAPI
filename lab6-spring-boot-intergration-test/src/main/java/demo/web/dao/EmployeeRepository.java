package demo.web.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.web.model.Employee;



@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long> 
{
	 
}