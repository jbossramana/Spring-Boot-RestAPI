package demo.books.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.books.models.Library;

public interface LibraryRepository extends CrudRepository<Library, Long> {

}
