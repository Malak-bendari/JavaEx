package dto;

import domain.Task;
import domain.TaskStatus;

import java.time.LocalDateTime;

public class TaskResponse {

    private final String id;
    private final String title;
    private final TaskStatus status;
    private final LocalDateTime createdAt;

    public TaskResponse(Task task) {
        this.id = task.getId();
        this.title = task.getTitle();
        this.status = task.getStatus();
        this.createdAt = task.getCreatedAt();
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
