package creationalPatterns.prototype;

public class Example {

    public static void main(String[] args) {

        String type = "Bus";
        Ticket ticket = TicketFactory.getPrototype(type);
        System.out.println(ticket);

        String typeUndefined = "Something";
        Ticket ticketNotFound = TicketFactory.getPrototype(typeUndefined);
        System.out.println(ticketNotFound);

    }

}
