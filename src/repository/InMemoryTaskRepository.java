package repository;

import domain.Task;
import java.util.*;

public class InMemoryTaskRepository implements TaskRepository {

    private final Map<String, Task> storage = new HashMap<>();

    @Override
    public void save(Task task) {
        storage.put(task.getId(), task);
    }

    @Override
    public Task findById(String id) {
        return storage.get(id);
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(storage.values());
    }
}
