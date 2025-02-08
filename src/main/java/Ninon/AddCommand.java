package Ninon;

/**
 * Represents a command to add a task to the task list.
 */
public class AddCommand extends Command {

    /**
     * The task to be added.
     */
    public Task task;

    /**
     * Constructs an AddCommand with the specified task.
     *
     * @param task The task to be added to the task list.
     */
    public AddCommand(Task task) {
        this.task = task;
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
     * Executes the add command by adding the task to the task list,
     * displaying the output, and exporting the updated task list to storage.
     *
     * @param taskList The task list to modify.
     * @param ui The user interface to interact with the user.
     * @param storage The storage to handle saving and loading of tasks.
     */
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.output(taskList.add_List(task));
        storage.export(taskList);
    }
}
