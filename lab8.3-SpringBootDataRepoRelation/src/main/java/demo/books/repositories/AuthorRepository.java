package demo.books.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.books.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
