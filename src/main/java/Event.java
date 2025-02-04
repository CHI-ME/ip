import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    protected LocalDate from;
    protected LocalDate to;

    public Event(String description, String from, String to) {
        super(description);
        this.from = LocalDate.parse(from);
        this.to = LocalDate.parse(to);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
        return "[E]" + super.toString() +
                " (from: " + from.format(formatter) +
                " to: " + to.format(formatter) + ")";
    }

    @Override
    public String formatOut() {
        return "E / " + super.formatOut() + " / " + this.from + " / " + this.to;
    }
}