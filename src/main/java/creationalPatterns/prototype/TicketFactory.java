package creationalPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class TicketFactory {

    private static final Map<String, Ticket> prototypes = new HashMap<>();

    static {
        prototypes.put("Train", new TrainTicket());
        prototypes.put("Metro", new MetroTicket());
        prototypes.put("Bus", new BusTicket());
    }

    public static Ticket getPrototype(String ticketType) {
        try {
            return prototypes.get(ticketType).clone();
        } catch (Exception e) {
            System.out.println("That type doesn't exist!");
            return null;
        }
    }

}
