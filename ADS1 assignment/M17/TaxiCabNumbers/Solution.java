import java.util.Scanner;
/**
 * Class for taxi cab.
 */
class TaxiCab implements Comparable<TaxiCab> {
    long sum;
    long i;
    long j;
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
     * Compares 2 objects and returns the value.
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
    public long sum() {return sum;}
    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }

}

/**
 * Class for solution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
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
            if (prev.sum() == c.sum()) {
                p++;
                if (p == m) {
                    sum = c.sum();
                    if (++k == n) { 
                        break;
                    }
                }
            } else {
                p = 1;
            }
            prev = c;
            if (c.j < 1500) {
                pq.insert(new TaxiCab(c.i, c.j + 1));
            }
        }
        System.out.println(sum);

    }
}