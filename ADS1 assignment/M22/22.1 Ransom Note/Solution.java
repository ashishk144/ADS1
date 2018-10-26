import java.util.Scanner;
/**
 * Class for Solution.
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
        String[] sizes = scan.nextLine().split(" ");
        int m = Integer.parseInt(sizes[0]);
        int n = Integer.parseInt(sizes[1]);
        SeparateChainingHashST<String, Integer> mag
            = new SeparateChainingHashST(m);
        String[] magazine = scan.nextLine().split(" ");
        String[] note = scan.nextLine().split(" ");
        for (int i = 0; i < magazine.length; i++) {
            if (mag.contains(magazine[i])) {
                mag.put(magazine[i], 1);
            } else {
                mag.put(magazine[i], mag.get(magazine[i]) + 1);
            }
        }
        for (int i = 0; i < note.length; i++) {
            if (mag.contains(note[i])) {
                if (mag.get(note[i]) == 0) {
                    System.out.println("No");
                    return;
                } else {
                    mag.put(note[i], mag.get(note[i]) - 1);
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
