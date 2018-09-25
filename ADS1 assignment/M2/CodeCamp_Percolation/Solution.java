import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the Solution object.
     */
    private Solution() {

    }
    /**
     * Main function to take inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Percolation percolate = new Percolation(n);
        int p, q;
        while (scan.hasNext()) {
            p = scan.nextInt();
            q = scan.nextInt();
            percolate.open(p - 1 , q - 1);
        }
        System.out.println(percolate.percolates());
    }
}