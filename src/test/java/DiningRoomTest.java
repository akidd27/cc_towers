import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    public DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Dining Room 1", 50);
    }

    @Test
    public void hasName(){
        assertEquals("Dining Room 1", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, diningRoom.getCapacity());
    }

    @Test
    public void guestsStartsAt0(){
        assertEquals(0, diningRoom.getNumberOfGuests());
    }
}
