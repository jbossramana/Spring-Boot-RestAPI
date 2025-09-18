package demo.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.boot.model.Task;



@RepositoryRestResource(itemResourceRel = "taskEndpoint", path = "task")
public interface TaskDao  extends CrudRepository<Task, Long>{

	
	//  http://localhost:8080/task/search/findTaskByDescription?desc=YOUR_DESCRIPTION
    // @Query("SELECT t FROM Task t WHERE t.description = :desc")
    List<Task> findTaskByDescription(@Param("desc") String description);
    
    // http://localhost:8080/task/search/findTasksByDescriptionContains?desc=code
    @Query("SELECT t FROM Task t WHERE t.description LIKE %:desc%")
    List<Task> findTasksByDescriptionContains(@Param("desc") String description);
	 
    // http://localhost:8080/task/search/countTasksByDescription?desc=YOUR_DESCRIPTION
    @Query("SELECT COUNT(t) FROM Task t WHERE t.description = :desc")
    long countTasksByDescription(@Param("desc") String description);
    
    @Query("SELECT t FROM Task t WHERE t.description LIKE %:desc% ORDER BY t.description ASC")
    List<Task> findTasksByDescriptionSorted(@Param("desc") String description);
    

}

