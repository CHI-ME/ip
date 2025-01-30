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
                String description = message.split("/")[0].replace("todo ","");
                respond = list.add_List(new Todo(description));
            } else if (Objects.equals(message.split(" ")[0], "deadline")) {
                String description = message.split("/")[0].replace("deadline ","");
                String by = message.split("/")[1].replace("by ","");
                respond = list.add_List(new Deadline(description, by));
            } else if (Objects.equals(message.split(" ")[0], "event")) {
                String description = message.split("/")[0].replace("event ","");
                String from = message.split("/")[1].replace("from ","");
                String to = message.split("/")[2].replace("to ","");
                respond = list.add_List(new Event(description, from, to));
            } else {
                respond = list.add_List(new Task(message));
            }
            System.out.println(SPLIT + respond + "\n" + SPLIT);
            message = input.nextLine();
        }

        System.out.println(SPLIT + exit + SPLIT);
    }

    public static String echo(String message) {
        return message;
    }

}
