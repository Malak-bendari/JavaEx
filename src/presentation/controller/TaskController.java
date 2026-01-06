package presentation.controller;

import dto.CreateTaskRequest;
import dto.TaskResponse;
import domain.Task;
import service.TaskService;

import java.util.List;
import java.util.stream.Collectors;

public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    public TaskResponse createTask(CreateTaskRequest dto) {
        Task task = service.createTask(dto.getTitle());
        return new TaskResponse(task);
    }

    public List<TaskResponse> listTasks() {
        return service.getAllTasks()
                .stream()
                .map(TaskResponse::new)
                .collect(Collectors.toList());
    }
}
