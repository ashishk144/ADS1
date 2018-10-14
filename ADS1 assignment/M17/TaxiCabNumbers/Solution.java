import java.util.*;
class TaxiCab implements Comparable<TaxiCab> {
    private long sum;
    private long i;
    private long j;
    /**
     * Constructs the object.
     *
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    public TaxiCab(long i, long j) {
        this.sum = i * i * i + j * j * j;
        this.i = i;
        this.j = j;
    }
    /**
     * Compares the values.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(TaxiCab that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
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
     * Sets i.
     *
     * @param      k     { parameter_description }
     */
    public void setI(final int k) {
        this.i = k;
    }
    /**
     * Sets the j.
     *
     * @param      l     { parameter_description }
     */
    public void setJ(final int l) {
        this.j = l;
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


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        MinPQ<TaxiCab> pq = new MinPQ<TaxiCab>();
        for (int i = 1; i <= 1000; i++) {
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
            if (c.getJ() < 1500) {
                pq.insert(new TaxiCab(c.getI(), c.getJ() + 1));
            }
        }
        System.out.println(sum);

    }
}