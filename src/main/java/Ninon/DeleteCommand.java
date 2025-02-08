package Ninon;

/**
 * Represents a command to delete a task from the task list.
 */
public class DeleteCommand extends Command {

    /**
     * The index of the task to be deleted.
     */
    public int num;

    /**
     * Constructs a DeleteCommand with the specified task index.
     *
     * @param num The index of the task to be removed from the task list.
     */
    public DeleteCommand(int num) {
        this.num = num;
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
     * Executes the delete command by removing the task from the task list,
     * displaying the output, and exporting the updated task list to storage.
     *
     * @param taskList The task list to modify.
     * @param ui The user interface to interact with the user.
     * @param storage The storage to handle saving and loading of tasks.
     */
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.output(taskList.delete(num));
        storage.export(taskList);
    }
}