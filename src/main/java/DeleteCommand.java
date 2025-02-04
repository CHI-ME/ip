public class DeleteCommand extends Command {
    public int num;

    public DeleteCommand(int num) {
        this.num = num;
    }

    public boolean isExit() {
        return false;
    }

    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.output(taskList.delete(num));
        storage.export(taskList);
    }
}
