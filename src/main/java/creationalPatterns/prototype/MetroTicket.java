package creationalPatterns.prototype;

public class MetroTicket implements Ticket {

    private final String TYPE = "Metro";

    @Override
    public Ticket clone() {
        return new MetroTicket();
    }

    @Override
    public String toString() {
        return "Ticket type: " + TYPE;
    }

}
