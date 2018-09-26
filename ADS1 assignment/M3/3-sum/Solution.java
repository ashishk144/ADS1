import java.util.Scanner;

/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Main function to take input and display output.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Threesum sum = new Threesum(n);
        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();
            sum.add(k);
        }
        System.out.println(sum.getcount());
    }
}