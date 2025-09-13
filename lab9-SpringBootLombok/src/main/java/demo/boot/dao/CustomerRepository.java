package demo.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.boot.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}