package domain;

public class TaskFactory {

    private TaskFactory() {

    }

    public static Task createTodo(String title) {
        return new TaskBuilder()
                .withTitle(title)
                .withStatus(TaskStatus.TODO)
                .createdNow()
                .build();
    }

    public static Task createInProgress(String title) {
        return new TaskBuilder()
                .withTitle(title)
                .withStatus(TaskStatus.IN_PROGRESS)
                .createdNow()
                .build();
    }
}
