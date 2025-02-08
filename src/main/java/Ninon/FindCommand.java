package Ninon;

public class FindCommand extends Command {  

    public String description;

    public FindCommand(String description) {
        this.description = description;
    }

    public boolean isExit() {
        return false;
    }

    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.output(taskList.find(description));
    }
}
