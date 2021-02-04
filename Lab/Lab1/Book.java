package Lab.Lab1;

/**
 * This class represents a book. A book has a title, an author and a price.
 */
public class Book {
    private String title;
    private Person author;
    private float price;

    /**
     * Construct a Book object that has the provided title, author and  price.
     *
     * @param title  the title to be given to this book
     * @param author the author to be given to this book
     * @param price  the price to be assigned to this book
     */

    public Book(String title, Person author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    /**
     * Return the title of this book.
     *
     * @return the title of this book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Return the price of this book.
     *
     * @return the price of this book
     */
    public float getPrice() {
        return this.price;
    }

    /**
     * Return the author of this object.
     *
     * @return the author of this object as a @link{Person}
     */
    public Person getAuthor() {
        return this.author;
    }

    /**
     * Return a string representation of this book, including
     * the title, author, and price
     * @Return a formatted string
     */
    public String toString() {
        /*
        Fields:
        this.title: String
        this.author: Person
        this.price: float
         */
        String str;
        str = "Title: " + this.title + "\n" +
                "Author: " + this.author.toString() + "\n";
        str = str + String.format("Price: %.2f", price);
        return str;
    }

    /**
     * Compute and return the price of this book with the given
     * discount (aw a percentage)
     * @param discount the percentage discount to be applied
     * @Return the discounted price of this book
     */
    public float salePrice(float discount) throws IllegalArgumentException {
        if (discount < 0) {
            throw new IllegalArgumentException("Discount cannot be negative");
        }
        return this.price - (this.price * discount) / 100;
    }

    /**
     * check if this book has the same author as another, and
     * return true if so, false otherwise
     * @param other the other book
     * @Return true if the two books have the same author, false otherwise
     */
    public boolean sameAuthor(Book other) {

         return this.author.same(other.author);
    }

    /**
     * Compute the sale price of this Book given using the given discount
     * rate and return a version of this book with the discounted price
     * @param discount the percentage discount to be applied to this book
     * @Return the new book that is identical to this book except the price if discounted
     */

}
