package com.taskmanager.dto;

import lombok.Data;

@Data
public class CreateTaskDto {
    private String name;
    private String description;
    private String timeToDo;
}
