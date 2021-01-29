package Lab.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A JUnit test class for the Email class.
 */
public class EmailTest {
    private Email email;

    @Before
    public void setUp() {
        email = new Email("john", "gmail.com");
    }

    @Test
    public void getUserName() {
        assertEquals("john", email.getUserName());
    }

    @Test
    public void getDomain() {
        assertEquals("gmail.com", email.getDomain());
    }
}