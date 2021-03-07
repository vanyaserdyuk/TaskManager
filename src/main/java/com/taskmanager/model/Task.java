package com.taskmanager.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Data
@NoArgsConstructor
public class Task {
    @Id
    private String id;
    private String name;
    private String description;
    private String timeToDo;
    private TaskType type;
}
