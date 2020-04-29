import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRoomByName;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.bookings = new ArrayList<Booking>();
        this.diningRoomByName = new HashMap<String, DiningRoom>();
    }

    public String getName() {
        return name;
    }

    public int getBedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void checkInGuest(Bedroom bedroom, Guest guest) {
        if(0 == bedroom.numberOfGuests()){
            bedroom.addAGuest(guest);
        }
    }

    public void checkOutGuest(Bedroom bedroom, Guest guest) {
        bedroom.removeAGuest(guest);
    }

    public int getBookingCount() {
        return bookings.size();
    }

    public Booking bookRoom(Bedroom bedroom, int numOfNights) {
        Booking booking = new Booking(bedroom, numOfNights);
        return booking;
    }

    public void addDiningRoom(DiningRoom diningroom) {
        diningRoomByName.put(diningroom.getName(), diningroom);
    }

    public DiningRoom getDiningRoomByName(String name) {
        return diningRoomByName.get(name);
    }


    public int getVacentBedRoomCount() {
        int vacentBedRoomCount = 0;
        for (Bedroom bedroom:bedrooms){
            if(0 == bedroom.numberOfGuests()){
                vacentBedRoomCount ++;
            }
        }
        return vacentBedRoomCount;
    }

    public ArrayList<Bedroom> getVacentBedRooms() {
        ArrayList<Bedroom> vacantBedRooms = new ArrayList<Bedroom>();
        for(Bedroom bedroom: this.bedrooms){
            if(0 == bedroom.numberOfGuests()){
                vacantBedRooms.add(bedroom);
            }
        }
        return vacantBedRooms;
    }
}
