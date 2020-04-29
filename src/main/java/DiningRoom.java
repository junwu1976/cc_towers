import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom(String name) {
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }
}
