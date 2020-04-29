public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;
    private int totalBill;

    public Booking(Bedroom bedroom, int numberOfNights) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
        this.totalBill = 0;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public int getTotalBill() {
        return bedroom.getNightlyRate() * numberOfNights;
    }
}
