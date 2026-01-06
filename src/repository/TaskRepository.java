package repository;

import domain.Task;
import java.util.List;

public interface TaskRepository {

    void save(Task task);

    Task findById(String id);

    List<Task> findAll();
}
