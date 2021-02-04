package Lab.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

    private Person john;
    private Email email;

    @Before
    public void setUp() {
        email = new Email("john","gmail.com");
        john = new Person("John", "Doe", 1945, "1234567", email);
    }

    @Test
    public void testFirst() {
        assertEquals("John", john.getFirstName());

    }

    @Test
    public void testSecond() {
        assertEquals("Doe", john.getLastName());
    }

    @Test
    public void testYearOfBirth() {
        assertEquals(1945, john.getYearOfBirth());
    }

    @Test
    public void testPhoneNum() {
        assertEquals("1234567", john.getPhoneNumber());
    }
    @Test
    public void testEmail() {
        assertEquals(email, john.getEmailAdd());
    }

    @Test
    public void testPersonString(){
        assertEquals("John Doe", john.toString());
    }
}
