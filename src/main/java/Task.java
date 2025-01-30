public class Task {
    private Boolean done;
    public final String event;
    public Task(Boolean done, String event) {
        this.done = done;
        this.event = event;
    }

    public void mark_As_Done() {
        this.done = true;
    }

    public void mark_As_Not_Done() {
        this.done = false;
    }

    public String to_String() {
        if (this.done) {
            return "[X] " + this.event;
        }
        return "[ ] " + this.event;
    }
}
