import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest3;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 2, "Double", 125);
        guest3 = new Guest("Keith");
    }
    @Test
    public void roomHasNumber(){
        assertEquals(101, bedroom1.getRoomNumber());
    }
    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }
    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom1.numberOfGuests());
    }
    @Test
    public void roomHasAType(){
        assertEquals("Double", bedroom1.getRoomType());
    }
    @Test
    public void roomHasANightlyRate(){
        assertEquals(125, bedroom1.getNightlyRate());
    }
    @Test
    public void canAddAGuestToRoom(){
        bedroom1.addAGuest(guest3);
        assertEquals(1, bedroom1.numberOfGuests());
    }
    @Test
    public void canRemoveAGuestFromRoom(){
        bedroom1.addAGuest(guest3);
        bedroom1.removeAGuest(guest3);
        assertEquals(0, bedroom1.numberOfGuests());
    }
}
