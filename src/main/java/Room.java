import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.roomType.getValue();
    }

    public int getNumberOfGuests() {
        return guests.size();
    };

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }
}
