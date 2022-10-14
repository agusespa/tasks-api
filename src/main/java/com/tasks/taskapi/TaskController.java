package com.tasks.taskapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {
        return ResponseEntity.ok(service.fetchAll());
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task newTask) {
        return ResponseEntity.ok(service.createTask(newTask));
    }

    @PutMapping
    public ResponseEntity<Task> editTask(@RequestBody TaskEditDTO task) {
        return ResponseEntity.ok(service.editTask(task));
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
