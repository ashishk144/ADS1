import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution () {

    }
    /**
     * Main function to handle inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        int i = 0;
        while (i < n) {
            String[] line = scan.nextLine().split(",");
            if(type.equals("String")) {
                MinPQ<String> m = new MinPQ();
                System.out.println(m.isHeap(line));
            } else if (type.equals("Float")) {
                MinPQ<Float> m = new MinPQ();
                System.out.println(m.isHeap(line));
            } else if (type.equals("Double")) {
                MinPQ<Double> m = new MinPQ();
                System.out.println(m.isHeap(line));
            } else if (type.equals("Integer")) {
                MinPQ<Integer> m = new MinPQ();
                System.out.println(m.isHeap(line));
            }
            i++;
        }
    }
}