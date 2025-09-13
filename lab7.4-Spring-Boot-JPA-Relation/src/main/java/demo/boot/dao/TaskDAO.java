package demo.boot.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import demo.boot.model.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

import java.util.Optional;

@Repository
@Transactional
public class TaskDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Task> getAllTasks() {
        return entityManager.createQuery("SELECT t FROM Task t", Task.class).getResultList();
    }

    public Optional<Task> getTaskById(Long id) {
        return Optional.ofNullable(entityManager.find(Task.class, id));
    }

    public Task createTask(Task task) {
        entityManager.persist(task);
        return task;
    }

    public Task updateTask(Task task) {
        return entityManager.merge(task);
    }

    public void deleteTask(Task task) {
        entityManager.remove(task);
    }
}
