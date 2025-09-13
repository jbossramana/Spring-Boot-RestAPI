package demo.dao;

import demo.entity.Department;

public interface DepartmentDao {
    void save(Department dept);
    Department find(Long id);
}
