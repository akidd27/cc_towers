public class Booking {

    private Bedroom bedroom;
    private int nights;

    public Booking(Bedroom bedroom, int nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public int getNights() {
        return nights;
    }

    public Bedroom getBedroom(){
        return this.bedroom;
    }

    public double getBill() {
        return this.bedroom.getNightlyRate() * this.nights;
    }
}
