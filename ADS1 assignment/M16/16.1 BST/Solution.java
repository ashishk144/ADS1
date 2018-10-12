import java.util.Scanner;

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
        Bst<Book, Integer> b = new Bst();
        while (scan.hasNext()) {
            String[] inp = scan.nextLine().split(",");
            switch(inp[0]) {
                case "put":
                    b.put(new Book(inp[1], inp[2], Double.parseDouble(
                        inp[3])), Integer.parseInt(inp[4]));
                    break;
                case "get":
                    System.out.println(b.get(new Book(inp[1], inp[2], Double.parseDouble(
                        inp[3]))));
                    break;
                default:
                    break;
            }
        }
    }
}