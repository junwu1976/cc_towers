import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Edinburgh", 5);
    }

    @Test
    public void roomHasAName(){
        assertEquals("Edinburgh", conferenceRoom1.getRoomName());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom1.getGuests());
    }
    @Test
    public void roomHasCapacity(){
        assertEquals(5, conferenceRoom1.getCapacity());
    }

}
