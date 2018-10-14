import java.util.Scanner;
/**
 * Class for taxi cab.
 */
class TaxiCab implements Comparable<TaxiCab> {
    /**
     * Sum.
     */
    private long sum;
    /**
     * i value.
     */
    private long i;
    /**
     * j value.
     */
    private long j;
    /**
     * Constructs the object.
     *
     * @param      k     { parameter_description }
     * @param      l     { parameter_description }
     */
    TaxiCab(final long k, final long l) {
        this.sum = k * k * k + l * l * l;
        this.i = k;
        this.j = l;
    }
    /**
     * Compares the values.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final TaxiCab that) {
        if (this.sum < that.sum) {
            return -1;
        }
        if (this.sum > that.sum) {
            return +1;
        }
        return 0;
    }
    /**
     * Gets the sum.
     *
     * @return     The sum.
     */
    public long getSum() {
        return sum;
    }
    /**
     * Gets i.
     *
     * @return     I.
     */
    public long getI() {
        return this.i;
    }
    /**
     * Gets the j.
     *
     * @return     The j.
     */
    public long getJ() {
        return this.j;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }

}

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * THOUSAND.
     */
    private static final int THOUSAND = 1000;
    /**
     * FIFTEEN HUNDRED.
     */
    private static final int FIFHUN = 1500;
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Main function to handle inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        MinPQ<TaxiCab> pq = new MinPQ<TaxiCab>();
        for (int i = 1; i <= THOUSAND; i++) {
            pq.insert(new TaxiCab(i, i));
        }
        TaxiCab prev = new TaxiCab(0, 0);
        long sum = 0;
        int p = 1;
        int k = 0;
        while (true) {
            TaxiCab c = pq.delMin();
            if (prev.getSum() == c.getSum()) {
                p++;
                if (p == m) {
                    sum = c.getSum();
                    if (++k == n) {
                        break;
                    }
                }
            } else {
                p = 1;
            }
            prev = c;
            if (c.getJ() < FIFHUN) {
                pq.insert(new TaxiCab(c.getI(), c.getJ() + 1));
            }
        }
        System.out.println(sum);
    }
}
