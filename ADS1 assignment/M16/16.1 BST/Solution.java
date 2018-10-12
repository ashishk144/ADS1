import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Magic Number.
     */
    private final static int THREE = 3;
    /**
     * Magic Number.
     */
    private final static int FOUR = 4;
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
        Bst<Book, Integer> b = new Bst();
        while (scan.hasNext()) {
            String[] inp = scan.nextLine().split(",");
            switch (inp[0]) {
                case "put":
                    b.put(new Book(inp[1], inp[2], Double.parseDouble(
                        inp[THREE])), Integer.parseInt(inp[FOUR]));
                    break;
                case "get":
                    System.out.println(b.get(new Book(inp[1], inp[2],
                        Double.parseDouble(inp[THREE]))));
                    break;
                default:
                    break;
            }
        }
    }
}
