import domain.Task;
import domain.TaskStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();


        Task t1 = new Task("1", "Faire le TP", TaskStatus.TODO, LocalDateTime.now());
        Task t2 = new Task("2", "Comprendre SOLID", TaskStatus.IN_PROGRESS, LocalDateTime.now());
        Task t3 = new Task("3", "Préparer le projet", TaskStatus.DONE, LocalDateTime.now());

        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);

        
        for (Task task : tasks) {
            System.out.println(task.getTitle() + " - " + task.getStatus());
        }
    }
}
