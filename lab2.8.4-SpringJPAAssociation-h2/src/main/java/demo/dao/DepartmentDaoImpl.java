package demo.dao;

import demo.entity.Department;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(Department dept) {
        em.persist(dept);
    }

    @Override
    @Transactional
    public Department find(Long id) {
        Department dept = em.find(Department.class, id);
        dept.getEmployees().size(); // Force fetch while session is open
        return dept;
    }
}
