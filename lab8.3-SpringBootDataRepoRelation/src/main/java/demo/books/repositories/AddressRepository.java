package demo.books.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.books.models.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
