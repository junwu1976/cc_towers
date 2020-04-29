import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Simba");
    }

    @Test
    public void hasAName(){
        assertEquals("Simba", guest1.getName());
    }

}
