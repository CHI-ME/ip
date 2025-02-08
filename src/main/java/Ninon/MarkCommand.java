package Ninon;

/**
 * Represents a command to mark or unmark a task as done.
 */
public class MarkCommand extends Command {

    /**
     * The index of the task to be marked or unmarked.
     */
    public int num;

    /**
     * Indicates whether the task should be marked as done (true) or not done (false).
     */
    public boolean is_mark;

    /**
     * Constructs a MarkCommand with the specified task index and mark status.
     *
     * @param num The index of the task to be marked or unmarked.
     * @param is_mark True to mark as done, false to unmark.
     */
    public MarkCommand(int num, boolean is_mark) {
        this.num = num;
        this.is_mark = is_mark;
    }

    /**
     * Returns false since this command does not exit the program.
     *
     * @return false, indicating the program should continue running.
     */
    public boolean isExit() {
        return false;
    }

    /**
     * Executes the mark command by marking or unmarking the task as done,
     * displaying the output, and exporting the updated task list to storage.
     *
     * @param taskList The task list containing the task to be modified.
     * @param ui The user interface to interact with the user.
     * @param storage The storage to handle saving and loading of tasks.
     */
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        if (this.is_mark) {
            ui.output(taskList.mark(num));
        } else {
            ui.output(taskList.unmark(num));
        }
        storage.export(taskList);
    }
}

