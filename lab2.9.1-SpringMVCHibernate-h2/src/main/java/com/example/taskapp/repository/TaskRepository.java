package com.example.taskapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.taskapp.model.Task;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class TaskRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Task> findAll() {
        return em.createQuery("FROM Task", Task.class).getResultList();
    }

    public Task findById(Long id) {
        return em.find(Task.class, id);
    }

    public void save(Task task) {
        if (task.getId() == null) em.persist(task);
        else em.merge(task);
    }

    public void delete(Long id) {
        Task t = findById(id);
        if (t != null) em.remove(t);
    }
}
