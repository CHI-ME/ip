package Ninon;

public class MarkCommand extends Command {
    public int num;
    public boolean is_mark;

    public MarkCommand(int num, boolean is_mark) {
        this.num = num;
        this.is_mark = is_mark;
    }

    public boolean isExit() {
        return false;
    }

    public void execute(TaskList taskList, Ui ui, Storage storage) {
        if (this.is_mark) {
            ui.output(taskList.mark(num));
        } else {
            ui.output(taskList.unmark(num));
        }
        storage.export(taskList);
    }
}
