package com.example.taskapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskapp.model.Task;
import com.example.taskapp.repository.TaskRepository;

import jakarta.transaction.Transactional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repo;

    public List<Task> getAllTasks() 
    { return repo.findAll(); 
    }
    
    public Task getTask(Long id) 
    { return repo.findById(id); 
    }
    
    @Transactional
    public void saveTask(Task task) 
    { repo.save(task); 
    }
    
    @Transactional
    public void deleteTask(Long id) 
    { repo.delete(id); 
    }
}
