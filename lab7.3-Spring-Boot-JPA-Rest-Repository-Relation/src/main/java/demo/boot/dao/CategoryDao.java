package demo.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.boot.model.Category;
import demo.boot.model.Task;



@RepositoryRestResource(itemResourceRel = "taskEndpoint", path = "category")
public interface CategoryDao  extends CrudRepository<Category, Long>{

    
}

