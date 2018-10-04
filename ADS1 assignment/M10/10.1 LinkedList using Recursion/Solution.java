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
        LinkedList<String> l = new LinkedList<String>();
        while (scan.hasNext()) {
            String[] inp = scan.nextLine().split(" ");
            switch (inp[0]) {
            case "insertAt":
                try {
                    l.insertAt(inp[2], Integer.parseInt(inp[1]));
                    System.out.println(l);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "reverse":
                try {
                    l.reverse();
                    System.out.println(l);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                break;
            }
        }
    }
}
