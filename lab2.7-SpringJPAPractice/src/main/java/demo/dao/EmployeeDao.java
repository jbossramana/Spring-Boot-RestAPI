package demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EmployeeDao implements IEmployeeDao {

	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.persist(employee);

	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.merge(employee);

	}

	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		
		return entityManager.find(Employee.class, id);

	}

}
