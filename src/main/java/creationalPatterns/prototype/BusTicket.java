package creationalPatterns.prototype;

public class BusTicket implements Ticket {

    private final String TYPE = "Bus";

    @Override
    public Ticket clone() {
        return new BusTicket();
    }

    @Override
    public String toString() {
        return "Ticket type: " + TYPE;
    }

}
