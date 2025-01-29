import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ninon {

    public static final String SPLIT = "____________________________________________________________\n";
    public static ArrayList<String> list = new ArrayList<String>(100);
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
                respond = print_List();
            } else {
                respond = add_List(message);
            }
            System.out.println(SPLIT + respond + "\n" + SPLIT);
            message = input.nextLine();
        }

        System.out.println(SPLIT + exit + SPLIT);
    }

    public static String echo(String message) {
        return message;
    }

    public static String add_List(String message) {
        list.add(message);
        return "added " + message;
    }

    public static String print_List() {
        String message = "";
        for (int i = 0; i < list.size(); i++) {
            message += (i + 1);
            message += ". " + list.get(i) + "\n";
        }
        return message;
    }
}
