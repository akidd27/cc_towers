import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    public Hotel hotel;
    public Bedroom bedroom;
    public ConferenceRoom conferenceRoom;
    public Guest guest;
    public DiningRoom diningRoom;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.SINGLE, 9);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Blue Room");
        guest = new Guest("Adam");
        diningRoom = new DiningRoom("Dining Room 1", 50);
    }

    @Test
    public void listsStartEmpty() {
        assertEquals(0, hotel.getNumberOfBedrooms());
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAdd() {
        hotel.addBedroom(bedroom);
        hotel.addConferenceRoom(conferenceRoom);

        assertEquals(1, hotel.getNumberOfBedrooms());
        assertEquals(1, hotel.getNumberOfConferenceRooms());


    }

    @Test
    public void canRemove() {
        hotel.addBedroom(bedroom);
        hotel.removeBedroom(bedroom);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.removeConferenceRoom(conferenceRoom);

        assertEquals(0, hotel.getNumberOfBedrooms());
        assertEquals(0, hotel.getNumberOfConferenceRooms());


    }

    @Test
    public void canCheckIn() {
        hotel.addBedroom(bedroom);
        hotel.checkIn(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuests());
        assertEquals(true, guest.isCheckedIn());
    }

    @Test
    public void canCheckOut() {
        hotel.addBedroom(bedroom);
        hotel.checkIn(guest, bedroom);
        hotel.checkOut(guest, bedroom);
        assertEquals(0, bedroom.getNumberOfGuests());
        assertEquals(false, guest.isCheckedIn());
    }

    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(bedroom, 3);
        assertEquals(3, booking.getNights());
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void diningRoomsStartsEmpty(){
        assertEquals(0, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void canAddAndGetDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(diningRoom, hotel.getDiningRoom("Dining Room 1"));
    }

    @Test
    public void canRemoveDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        hotel.removeDiningRoom(diningRoom);
        assertEquals(0, hotel.getNumberOfDiningRooms());
    }
}
