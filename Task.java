import java.time.LocalDateTime;

public class Task {
    private String title;
    private boolean isCompleted;
    private LocalDateTime createdAt;

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }

    @Override
    public String toString() {
        String status = isCompleted ? "[✔] مكتملة" : "[ ] قيد التنفيذ";
        return status + " - " + title + " (أُنشئت في: " + createdAt + ")";
    }
}
