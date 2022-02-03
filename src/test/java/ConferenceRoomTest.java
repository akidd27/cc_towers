import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    public ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Blue Room");
    }

    @Test
    public void hasName() {
        assertEquals("Blue Room", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, conferenceRoom.getCapacity());
    }
}
