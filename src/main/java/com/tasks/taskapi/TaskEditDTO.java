package com.tasks.taskapi;

public class TaskEditDTO {

    private Long id;

    private String title;

    private boolean done;

    private String dueDate;

    public TaskEditDTO() {
    }

    public TaskEditDTO(Long id, String title, boolean done, String dueDate) {
        this.id = id;
        this.title = title;
        this.done = done;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
