package domain;

import java.time.LocalDateTime;

public class Task {

    private final String id;
    private final String title;
    private TaskStatus status; // on enlève final pour pouvoir changer
    private final LocalDateTime createdAt;

    public Task(String id, String title, TaskStatus status, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
