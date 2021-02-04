package Lab.Lab2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransmissionBoxTest {
    private TransmissionBox tb1;

    @Before
    public void setUp() throws Exception {
        tb1 = new TransmissionBox(5, 10, 20, 35, 50);
    }

    @Test
    public void increase() {
        assertEquals(7, tb1.increase().getCurrentSpeed());
    }

    @Test
    public void decrease() {
        assertEquals(3, tb1.decrease().getCurrentSpeed());
    }

    @Test
    public void getCurrentSpeed() {
        assertEquals(5, tb1.getCurrentSpeed());
    }

    @Test
    public void getGear() {
        assertEquals(1, tb1.getGear());
    }

    @Test
    public void testToString() {
        String str = "Current Speed is: " + tb1.getCurrentSpeed() + "\n";
        str += "Current Gear is: " + tb1.getGear();
        assertEquals(str, tb1.toString());
    }
}