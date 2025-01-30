import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> list;
    public TaskList() {
        this.list = new ArrayList<Task>(100);
    }

    public String add_List(Task task) {
        this.list.add(task);
        String message = "Got it. I've added this task: \n";
        message += task.toString() + "\n";
        message += "Now you have " + list.size() + " tasks in the list.";
        return message;
    }

    public String mark(int i) {
        Task task = this.list.get(i-1);
        task.mark_As_Done();
        return task.toString() + "\n";
    }

    public String unmark(int i) {
        Task task = this.list.get(i-1);
        task.mark_As_Not_Done();
        return task.toString() + "\n";
    }

    public String toString() {
        String message = "Here are the tasks in your list:";
        for (int i = 0; i < list.size(); i++) {
            message += "\n";
            message += (i + 1);
            message += "." + list.get(i).toString();
        }
        return message;
    }
}
