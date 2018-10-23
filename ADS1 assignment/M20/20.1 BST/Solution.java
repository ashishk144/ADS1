import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Magic Number.
     */
    private static final int THREE = 3;
    /**
     * Magic Number.
     */
    private static final int FOUR = 4;
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
        BinaryST<Book, Integer> b = new BinaryST();
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
                case "max":
                    System.out.println(b.max());
                    break;
                case "min":
                    System.out.println(b.min());
                    break;
                case "select":
                    System.out.println(b.select(Integer.parseInt(inp[1])));
                    break;
                case "floor":
                    System.out.println(b.floor(new Book(inp[1], inp[2],
                        Double.parseDouble(inp[THREE]))));
                    break;
                case "ceiling":
                    System.out.println(b.ceil(new Book(inp[1], inp[2],
                        Double.parseDouble(inp[THREE]))));
                    break;
                case "deleteMin":
                    b.deleteMin();
                    break;
                case "deleteMax":
                    b.deleteMax();
                    break;
                case "delete":
                    b.delete(new Book(inp[1], inp[2],
                        Double.parseDouble(inp[THREE])));
                    break;
                default:
                    break;
            }
        }
    }
}
