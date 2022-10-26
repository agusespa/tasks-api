package com.tasks.taskapi;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TaskService {

    private TaskRepo repo;

    public TaskService(TaskRepo repo) {
        this.repo = repo;
    }

    List<Task> fetchAll() {
        return repo.findAll();
    }

    Task createTask(Task task) {
        return repo.save(task);
    }

    Task editTask(TaskEditDTO task) {
        Task editedTask = new Task();
        editedTask.setId(task.getId());
        editedTask.setTitle(task.getTitle());
        editedTask.setDone(task.isDone());

        if (task.getDueDate() == null || task.getDueDate() == "") {
            editedTask.setDueDate(null);
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(task.getDueDate(), formatter);
            editedTask.setDueDate(date);
        }

        return repo.save(editedTask);
    }

    void deleteTask(Long id) {
        repo.deleteById(id);
    }
}
