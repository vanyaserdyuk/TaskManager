package com.taskmanager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tasks")
public class TaskController {
    @GetMapping()
    public ResponseEntity<String> getAllTasks(){
        return new ResponseEntity<>("Task created", HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<String> createTask(){
        return new ResponseEntity<>("Task created", HttpStatus.OK);
    }
}
