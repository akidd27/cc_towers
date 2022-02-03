import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    public Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 9);
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(9, bedroom.getRoomNumber());
    }

    @Test
    public void guestsStartsEmpty() {
        assertEquals(0, bedroom.getNumberOfGuests());
    }


}
