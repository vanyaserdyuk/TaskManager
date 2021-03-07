package com.taskmanager.service;

import com.taskmanager.model.Task;
import com.taskmanager.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task){
       return taskRepository.insert(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
}
