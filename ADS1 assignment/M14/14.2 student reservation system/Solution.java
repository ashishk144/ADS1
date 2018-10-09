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
     * Main function to handle inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Merit m = new Merit(n);
        int vac = Integer.parseInt(scan.nextLine());
        int urvac = Integer.parseInt(scan.nextLine());
        int bcvac = Integer.parseInt(scan.nextLine());
        int scvac = Integer.parseInt(scan.nextLine());
        int stvac = Integer.parseInt(scan.nextLine());
        while (scan.hasNext()) {
            String[] s = scan.nextLine().split(",");
            m.add(new Student(s[0], s[1], Integer.parseInt(s[2]
                ), Integer.parseInt(s[3]), Integer.parseInt(s[4]
                ), Integer.parseInt(s[5]), s[6]));
        }
        System.out.println(m.meritlist());
        System.out.println();
        System.out.println(m.allocation(vac, urvac, bcvac, scvac, stvac));
    }
}
