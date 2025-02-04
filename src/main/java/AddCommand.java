public class AddCommand extends Command {

    public Task task;

    public AddCommand(Task task) {
        this.task = task;
    }

    public boolean isExit() {
        return false;
    }

    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.output(taskList.add_List(task));
        storage.export(taskList);
    }
}
