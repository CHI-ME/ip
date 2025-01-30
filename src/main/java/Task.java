public class Task {
    private Boolean done;
    private String event;
    public Task(String event) {
        this.done = false;
        this.event = event;
    }

    public void mark_As_Done() {
        this.done = true;
    }

    public void mark_As_Not_Done() {
        this.done = false;
    }

    public String toString() {
        if (this.done) {
            return "[X] " + this.event;
        }
        return "[ ] " + this.event;
    }
}
