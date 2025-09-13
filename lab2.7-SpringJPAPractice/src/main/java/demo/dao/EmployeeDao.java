package demo.dao;



import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

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
