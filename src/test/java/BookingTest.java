import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking1;
    Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(103, 1, "Single", 200);
        booking1 = new Booking(bedroom1, 3);
    }
    @Test
    public void checkBookingDetails(){
        assertEquals(3, booking1.getNumberOfNights());
        assertEquals(bedroom1, booking1.getBedroom());
    }
    @Test
    public void canGetTotalBill(){
        assertEquals(600, booking1.getTotalBill());
    }
}
