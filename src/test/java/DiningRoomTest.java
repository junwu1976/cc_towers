import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest5;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Loch Ness");
        guest5 = new Guest("Juan");
    }
    @Test
    public void hasAName(){
        assertEquals("Loch Ness", diningRoom.getName());
    }
    @Test
    public void canAddAGuest(){
        diningRoom.addGuest(guest5);
        assertEquals(1, diningRoom.getNumberOfGuests());
    }
}
