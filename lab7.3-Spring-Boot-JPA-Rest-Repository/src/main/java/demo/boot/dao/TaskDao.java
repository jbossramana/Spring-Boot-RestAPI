package demo.boot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.boot.model.Task;



@RepositoryRestResource(itemResourceRel = "taskEndpoint", path = "task")
public interface TaskDao  extends CrudRepository<Task, Long>{

	
	  public List<Task> findTaskByDescription(@Param("desc") String description);
	 
    
}

