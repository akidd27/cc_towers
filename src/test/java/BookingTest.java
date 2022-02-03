import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    public Booking booking;
    public Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 10);
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void hasBedroom(){
        assertEquals(2, booking.getBedroom().getCapacity());
    }

    @Test
    public void hasNights(){
        assertEquals(2, booking.getNights());
    }

    @Test
    public void canGetBill(){
        assertEquals(100, booking.getBill(), 0.00);
    }
}
