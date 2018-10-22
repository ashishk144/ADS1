// import java.util.;
/**
 * Class for book.
 */
public class Book implements Comparable<Book> {
    /**
     * Book name.
     */
    private String name;
    /**
     * Author name.
     */
    private String author;
    /**
     * Price.
     */
    private Double price;
    /**
     * Constructs the object.
     */
    public Book() {

    }
    /**
     * Constructor for book.
     */
    public Book(final String book, final String autname, final Double cost) {
        this.name = book;
        this.author = autname;
        this.price = cost;
    }
    /**
     * Compares 2 parameters.
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Book b) {
        return this.price.compareTo(b.price);
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += this.name + ", " + this.author + ", " + this.price;
        return s;
    }
}