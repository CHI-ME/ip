import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> list;
    public TaskList() {
        this.list = new ArrayList<Task>(100);
    }

    public String add_List(String message) {
        Task task = new Task(false, message);
        this.list.add(task);
        return "added: "+ message;
    }

    public String mark(int i) {
        Task task = this.list.get(i-1);
        task.mark_As_Done();
        return task.to_String() + "\n";
    }

    public String unmark(int i) {
        Task task = this.list.get(i-1);
        task.mark_As_Not_Done();
        return task.to_String() + "\n";
    }

    public String to_String() {
        String message = "";
        for (int i = 0; i < list.size(); i++) {
            message += (i + 1);
            message += "." + list.get(i).to_String() + "\n";
        }
        return message;
    }
}
