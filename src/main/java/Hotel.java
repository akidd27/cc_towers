import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void removeBedroom(Bedroom bedroom) {
        bedrooms.remove(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public void removeConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.remove(conferenceRoom);
    }

    public void checkIn(Guest guest, Room room) {
        if (room.getNumberOfGuests() == 0) {
            room.addGuest(guest);
            guest.setCheckedIn(true);
        }

    }

    public void checkOut(Guest guest, Room room) {
        room.removeGuest(guest);
        guest.setCheckedIn(false);
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking(bedroom, nights);
        return booking;
    }

    public DiningRoom getDiningRoom(String name){
        return diningRooms.get(name);
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public void removeDiningRoom(DiningRoom diningRoom){
        this.diningRooms.remove(diningRoom.getName());
    }

    public int getNumberOfDiningRooms(){
        return this.diningRooms.size();
    }

    public ArrayList<Bedroom> getVacantRooms() {
        ArrayList vacantRooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getNumberOfGuests() == 0) {
                vacantRooms.add(bedroom);
            }
        }

        return vacantRooms;
    }
}
