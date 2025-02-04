import java.time.format.DateTimeParseException;
import java.util.Objects;

public class Parser {

    public static Command parse(String message) throws DukeException {
        Command command;
        if (Objects.equals(message, "bye")) {
            command = new ExitCommand();
        } else if (Objects.equals(message, "list")) {
            command = new ListCommand();
        } else if (Objects.equals(message.split(" ")[0], "mark")) {
            command = new MarkCommand(Integer.parseInt(message.split(" ")[1]),true);
        } else if (Objects.equals(message.split(" ")[0], "unmark")) {

            command = new MarkCommand(Integer.parseInt(message.split(" ")[1]),false);
        } else if (Objects.equals(message.split(" ")[0], "todo")) {
            if (message.split(" ").length == 1) {
                throw new DukeException("OOPS!!! The description of a todo cannot be empty.");
            } else {
                String description = message.split("/")[0].replace("todo ", "");
                command = new AddCommand(new Todo(description));
            }
        } else if (Objects.equals(message.split(" ")[0], "deadline")) {
            if (message.split(" ").length == 1) {
                throw new DukeException("OOPS!!! The description of a deadline cannot be empty.");
            } else if (message.split("/").length == 1) {
                throw new DukeException("OOPS!!! The by of a deadline cannot be empty.");
            } else {
                String description = message.split("/")[0].replace("deadline ", "");
                String by = message.split("/")[1].replace("by ", "");
                try {
                    command = new AddCommand(new Deadline(description, by));
                } catch (DateTimeParseException e) {
                    throw new DukeException("date input format should be yyyy-mm-dd or date out of range");
                }

            }
        } else if (Objects.equals(message.split(" ")[0], "event")) {
            if (message.split(" ").length == 1) {
                throw new DukeException("OOPS!!! The description of a event cannot be empty.");
            } else if (message.split("/").length == 1) {
                throw new DukeException("OOPS!!! The from of a event cannot be empty.");
            } else if (message.split("/").length == 2) {
                throw new DukeException("OOPS!!! The to of a event cannot be empty.");
            } else {
                String description = message.split("/")[0].replace("event ", "");
                String from = message.split("/")[1].replace("from ", "");
                String to = message.split("/")[2].replace("to ", "");
                try {
                    command = new AddCommand(new Event(description, from, to));
                } catch (DateTimeParseException e) {
                    throw new DukeException("date input format should be yyyy-mm-dd or date out of range");
                }

            }
        } else if (Objects.equals(message.split(" ")[0], "delete")) {
            command = new DeleteCommand(Integer.parseInt(message.split(" ")[1]));
        } else {
            throw new DukeException("OOPS!!! I'm sorry, but I don't know what that means :-(");
        }
        return command;
    }
}