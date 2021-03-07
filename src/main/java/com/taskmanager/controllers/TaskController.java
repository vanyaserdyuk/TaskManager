package com.taskmanager.controllers;

import com.taskmanager.dto.CreateTaskDto;
import com.taskmanager.model.Task;
import com.taskmanager.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tasks")
public class TaskController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TaskService taskService;

    @GetMapping()
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> tasks = taskService.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> createTask(@RequestBody CreateTaskDto createTaskDto){
        Task task = modelMapper.map(createTaskDto, Task.class);
        taskService.createTask(task);
        return new ResponseEntity<>("Task created", HttpStatus.OK);
    }
}
