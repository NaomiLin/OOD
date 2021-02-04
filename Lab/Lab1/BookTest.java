package Lab.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testBookString(){
        String expected;
        expected = "Title: Harry Potter\nAuthor: J.K. Rowling\n" + "Price: 50.00";
        assertEquals(expected, harry.toString());
    }

    @Test
    public void testDiscount(){
        float discountedPrice = harry.salePrice(20);
        assertEquals(40.0d, discountedPrice, 0.01);
    }
    /*@Test
    public void testDiscountBook(){
        Book discountedBook = harry.discountBook(20);
        assertTrue(harry.sameAuthor(discountedBook));
        assertEquals(harry.getTitle(), discountedBook.getTitle());
        assertEquals(40f, discountedBook.getPrice(), 0.01);
    }

     */

}
