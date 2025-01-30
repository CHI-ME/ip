import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ninon {

    public static final String SPLIT = "____________________________________________________________\n";
    public static TaskList list = new TaskList();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String greet = "Hello! I'm NINON\n" +
                "What can I do for you?\n";
        String exit = "Bye. Hope to see you again soon!\n";

        System.out.println(SPLIT + greet + SPLIT);
        String message = input.nextLine();

        while (true) {
            String respond;
            try {
                if (Objects.equals(message, "bye")) {
                    break;
                } else if (Objects.equals(message, "list")) {
                    respond = list.toString();
                } else if (Objects.equals(message.split(" ")[0], "mark")) {
                    respond = "Nice! I've marked this task as done:\n";
                    respond += list.mark(Integer.parseInt(message.split(" ")[1]));
                } else if (Objects.equals(message.split(" ")[0], "unmark")) {
                    respond = "Nice! I've marked this task as not done yet:\n";
                    respond += list.unmark(Integer.parseInt(message.split(" ")[1]));
                } else if (Objects.equals(message.split(" ")[0], "todo")) {
                    if (message.split(" ").length == 1) {
                        throw new DukeException("OOPS!!! The description of a todo cannot be empty.");
                    } else {
                        String description = message.split("/")[0].replace("todo ","");
                        respond = list.add_List(new Todo(description));
                    }
                } else if (Objects.equals(message.split(" ")[0], "deadline")) {
                    if (message.split(" ").length == 1) {
                        throw new DukeException("OOPS!!! The description of a deadline cannot be empty.");
                    } else if (message.split("/").length == 1) {
                        throw new DukeException("OOPS!!! The by of a deadline cannot be empty.");
                    } else {
                        String description = message.split("/")[0].replace("deadline ","");
                        String by = message.split("/")[1].replace("by ","");
                        respond = list.add_List(new Deadline(description, by));
                    }
                } else if (Objects.equals(message.split(" ")[0], "event")) {
                    if (message.split(" ").length == 1) {
                        throw new DukeException("OOPS!!! The description of a event cannot be empty.");
                    } else if (message.split("/").length == 1) {
                        throw new DukeException("OOPS!!! The from of a event cannot be empty.");
                    } else if (message.split("/").length == 2) {
                        throw new DukeException("OOPS!!! The to of a event cannot be empty.");
                    } else {
                        String description = message.split("/")[0].replace("event ","");
                        String from = message.split("/")[1].replace("from ","");
                        String to = message.split("/")[2].replace("to ","");
                        respond = list.add_List(new Event(description, from, to));
                    }
                } else {
                    throw new DukeException("OOPS!!! I'm sorry, but I don't know what that means :-(");
                }
                System.out.println(SPLIT + respond + "\n" + SPLIT);
            } catch (DukeException exception) {
                System.out.println(SPLIT + exception.getMessage() + "\n" + SPLIT);
            }
            message = input.nextLine();
        }

        System.out.println(SPLIT + exit + SPLIT);
    }

    public static String echo(String message) {
        return message;
    }

}
