package Lab.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Book class.
 */

public class BookTest {
    private Book harry;
    private Email email;
    private Person jkRowling;

    @Before
    public void setUp() {
        email = new Email("harrypotter", "gmail.com");
        jkRowling = new Person("J.K.","Rowling",1965, "12345", email);
        harry = new Book("Harry Potter", jkRowling, 50f);
    }

    @Test
    public void testTitle() {
        assertEquals("Harry Potter", harry.getTitle());

    }

    @Test
    public void testPrice() {
        assertEquals(50.0, harry.getPrice(), 0.1);

    }

    @Test
    public void testAuthor() {
        assertEquals(jkRowling, harry.getAuthor());
    }

    @Test
    public void testAuthorYear() {
        assertEquals(1965, harry.getAuthor().getYearOfBirth());
    }

}
