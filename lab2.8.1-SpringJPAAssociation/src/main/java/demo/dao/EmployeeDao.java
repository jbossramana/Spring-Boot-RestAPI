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
	
	public void saveEmployee(EmployeeEntity employeeEntity) {
		entityManager.persist(employeeEntity);

	}

	public EmployeeEntity getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(EmployeeEntity.class , id);
	}

}
