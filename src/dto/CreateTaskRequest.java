package dto;

public class CreateTaskRequest {

    private final String title;

    public CreateTaskRequest(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
