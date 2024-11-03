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
	
	public void saveEmployee(EmployeeEntity employeeEntity) {
		entityManager.persist(employeeEntity);

	}

	public EmployeeEntity getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(EmployeeEntity.class , id);
	}

}
