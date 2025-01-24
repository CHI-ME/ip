import java.util.Objects;
import java.util.Scanner;
public class Ninon {

    public static final String SPLIT = "____________________________________________________________\n";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String greet = "Hello! I'm NINON\n" +
                "What can I do for you?\n";
        String exit = "Bye. Hope to see you again soon!\n";

        System.out.println(SPLIT + greet + SPLIT);
        String message = input.nextLine();

        while (!Objects.equals(message, "bye")) {
            String respond = echo(message);
            System.out.println(SPLIT + respond + "\n" + SPLIT);
            message = input.nextLine();
        }

        System.out.println(SPLIT + exit + SPLIT);
    }

    public static String echo(String message) {
        return message;
    }
}
