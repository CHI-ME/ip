package Ninon;

/**
 * Represents a command to list all tasks in the task list.
 */
public class ListCommand extends Command {

    /**
     * Constructs a ListCommand instance.
     */
    public ListCommand() {
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
     * Executes the list command by displaying all tasks in the task list.
     *
     * @param taskList The task list containing the tasks.
     * @param ui The user interface to interact with the user.
     * @param storage The storage (not modified in this command).
     */
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.output(taskList.toString());
    }
}
