package creationalPatterns.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketFactoryTest {

    Ticket ticket;
    String types[] = {"Bus", "Metro", "Train"};

    @Test
    void getPrototype() {
        for(String type : types) {
            ticket = TicketFactory.getPrototype(type).clone();
            assertNotNull(ticket);
            assertEquals(ticket.toString(), "Ticket type: " + type);
        }
    }

    @Test
    void getPrototypeNotFound() {
        assertThrows(Exception.class, () -> {
            ticket = TicketFactory.getPrototype("something").clone();
            assertNull(ticket);
        });
    }

}
