/**
 * Class for stock.
 */
public class Stock implements Comparable<Stock> {
    /**
     * To store stock name.
     */
    private String stock;
    /**
     * To store change value.
     */
    private Double change;
    /**
     * Constructs the object.
     *
     * @param      name  The name
     * @param      c     { parameter_description }
     */
    public Stock(String name, Double c) {
        this.stock = name;
        this.change = c;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.stock;
    }
    /**
     * Gets the change.
     *
     * @return     The change.
     */
    public Double getChange() {
        return this.change;
    }
    /**
     * Compares the objects.
     *
     * @param      k     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Stock k) {
        if (this.change > k.change) {
            return 1;
        } else if (this.change < k.change) {
            return -1;
        } else {
            return this.stock.compareTo(k.stock);
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.stock + " " + this.change;
    }
}