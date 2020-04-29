import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest2;
    private DiningRoom diningroom1;

    @Before
    public void before(){
        hotel = new Hotel("CC Towers");
        bedroom1 = new Bedroom(105,2,"Double",110);
        bedroom2 = new Bedroom(102, 1, "Single", 70);
        guest2 = new Guest("Tony");
        diningroom1 = new DiningRoom("Loch Ness");
    }
    @Test
    public void hasAName(){
        assertEquals("CC Towers", hotel.getName());
    }
    @Test
    public void startsEmpty(){
        assertEquals(0, hotel.getBedroomCount());
    }
    @Test
    public void canAddABedroom(){
        hotel.addBedroom(bedroom2);
        assertEquals(1, hotel.getBedroomCount());
    }
    @Test
    public void canCheckInGuest(){
        hotel.addBedroom(bedroom2);
        hotel.checkInGuest(bedroom2, guest2);
        assertEquals(1, bedroom2.numberOfGuests());
    }
    @Test
    public void canCheckOutGuest(){
        hotel.addBedroom(bedroom2);
        hotel.checkInGuest(bedroom2, guest2);
        hotel.checkOutGuest(bedroom2, guest2);
        assertEquals(0, bedroom2.numberOfGuests());
    }
    @Test
    public void bookingsStartsEmpty(){
        assertEquals(0, hotel.getBookingCount());
    }
    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(bedroom2, 4);
        assertEquals(280, booking.getTotalBill());
    }
    @Test
    public void canGetDiningRoomDetails(){
        hotel.addDiningRoom(diningroom1);
        assertEquals(diningroom1, hotel.getDiningRoomByName("Loch Ness"));
    }

    @Test
    public void canGetVacentBedRooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.checkInGuest(bedroom1,guest2);
        ArrayList<Bedroom> expectResult = new ArrayList<Bedroom>();
        expectResult.add(bedroom2);
        assertEquals(expectResult,hotel.getVacentBedRooms());
    }
}
