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
     * Main function to handle inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            Merge m = new Merge();
            m.sort(line);
            System.out.println(Arrays.toString(line));
            System.out.println();
        }
    }
}
