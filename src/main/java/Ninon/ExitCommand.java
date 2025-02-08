package Ninon;

public class ExitCommand extends Command {

    public ExitCommand() {
    }

    public boolean isExit() {
        return true;
    }

    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.exit();
    }
}
