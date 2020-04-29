import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, String roomType, int nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int numberOfGuests() {
        return this.guests.size();
    }

    public String getRoomType() {
        return this.roomType;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }

    public void addAGuest(Guest guest) {
        if (numberOfGuests() < this.capacity){
            this.guests.add(guest);
        }
    }

    public void removeAGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
