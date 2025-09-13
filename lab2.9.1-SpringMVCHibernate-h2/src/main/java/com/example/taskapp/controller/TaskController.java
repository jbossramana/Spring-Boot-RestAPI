package com.example.taskapp.controller;

import com.example.taskapp.model.Task;
import com.example.taskapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("tasks", service.getAllTasks());
        return "task-list";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        service.saveTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable("id") Long id) {
        service.deleteTask(id);
        return "redirect:/tasks";
    }
}
