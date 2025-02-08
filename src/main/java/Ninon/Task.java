package Ninon;

/**
 * Represents a task with a description and a completion status.
 */
public class Task {
    private Boolean done; // Indicates whether the task is completed.
    private String event; // Stores the task description.

    /**
     * Constructs a new Task with the specified description.
     * The task is initially marked as not done.
     *
     * @param event the description of the task
     */
    public Task(String event) {
        this.done = false;
        this.event = event;
    }

    /**
     * Marks the task as completed.
     */
    public void mark_As_Done() {
        this.done = true;
    }

    /**
     * Marks the task as not completed.
     */
    public void mark_As_Not_Done() {
        this.done = false;
    }

    /**
     * Returns a string representation of the task,
     * showing whether it is done or not.
     *
     * @return a formatted string representing the task status and description
     */
    @Override
    public String toString() {
        if (this.done) {
            return "[X] " + this.event;
        }
        return "[ ] " + this.event;
    }

    /**
     * Formats the task's status and description for output.
     * The format follows "1 / event" if done and "0 / event" if not done.
     *
     * @return a formatted string indicating task completion status and description
     */
    public String formatOut() {
        if (this.done) {
            return "1 / " + this.event;
        }
        return "0 / " + this.event;
    }
}
