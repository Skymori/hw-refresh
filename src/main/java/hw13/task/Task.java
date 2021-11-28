package hw13.task;

public class Task {
    private int userId;
    private int id;
    private String title;
    private boolean complete;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", complete=" + complete +
                '}';
    }
}
