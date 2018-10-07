import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Main function to take input and deliver output.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            QuickSort q = new QuickSort();
            int cutoff = Integer.parseInt(scan.nextLine());
            String[] array = scan.nextLine().split(" ");
            q.sort(array, cutoff);
            System.out.println(Arrays.toString(array));
        }
    }
}