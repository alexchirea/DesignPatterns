package creationalPatterns.prototype;

public class TrainTicket implements Ticket {

    private final String TYPE = "Train";

    @Override
    public Ticket clone() {
        return new TrainTicket();
    }

    @Override
    public String toString() {
        return "Ticket type: " + TYPE;
    }

}
