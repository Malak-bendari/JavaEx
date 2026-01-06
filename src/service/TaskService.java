package service;

import domain.Task;
import domain.TaskFactory;
import repository.TaskRepository;

import java.util.List;

public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task createTask(String title) {


        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        Task task = TaskFactory.createTodo(title);
        repository.save(task);

        return task;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }
}
