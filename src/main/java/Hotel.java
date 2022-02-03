import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
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
        room.addGuest(guest);
        guest.setCheckedIn(true);
    }

    public void checkOut(Guest guest, Room room) {
        room.removeGuest(guest);
        guest.setCheckedIn(false);
    }
}
