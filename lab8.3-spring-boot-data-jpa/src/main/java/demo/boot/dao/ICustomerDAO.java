package demo.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDAO extends  CrudRepository<Customer, Long>
{
} 