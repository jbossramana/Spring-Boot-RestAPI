package com.example.taskapp.controller;

import com.example.taskapp.model.Task;
import com.example.taskapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskRestController {

    @Autowired
    private TaskService service;
    
    public TaskRestController() {
        System.out.println("TaskRestController created!");
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable("id") Long id) {
        return service.getTask(id);
    }

    @PostMapping
    public void createTask(@RequestBody Task task) {
        service.saveTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        service.deleteTask(id);
    }
}
