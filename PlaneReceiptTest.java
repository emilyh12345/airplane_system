//singleton pattern - Emily Haller
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

// import static org.junit.Assert.assertEquals;

class PlaneReceiptTest {

    @org.junit.jupiter.api.Test
    void checkTicketNumber() {
        Assertions.assertEquals(2, PlaneReceipt.getTicket().getTicketNumber());
        Assertions.assertEquals(4, PlaneReceipt.getTicket().getTicketNumber());
    }

    @org.junit.jupiter.api.Test
    void checkTicketTime() {
        Assertions.assertEquals(LocalDateTime.now().getDayOfYear(),
                PlaneReceipt.getTicket().getLocalDateTime().getDayOfYear());
    }

    @org.junit.jupiter.api.Test
    void checkSeatNumber() {
        Assertions.assertEquals(1, PlaneReceipt.getTicket().getSeatNumber());
        Assertions.assertEquals(2, PlaneReceipt.getTicket().getSeatNumber());
    }
}




