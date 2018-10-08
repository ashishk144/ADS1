import java.util.Scanner;
import java.util.Arrays;


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
        int size;
        while (i < n) {
            String inp = scan.nextLine();
            String[] input = inp.split(",");
            if (inp.length() < 1) {
                System.out.println("false");
            } else {
                if (type.equals("String")) {
                    MinPQ<String> m = new MinPQ();
                    System.out.println(m.isHeap(input));
                } else if (type.equals("Float")) {
                    MinPQ<Float> m = new MinPQ();
                    size = 0;
                    Float[] floatArray = new Float[input.length];
                    for (int j = 0; j < input.length; j++) {
                        floatArray[size++] = Float.parseFloat(input[j]);
                    }
                    System.out.println(m.isHeap(floatArray));
                } else if (type.equals("Double")) {
                    MinPQ<Double> m = new MinPQ();
                    size = 0;
                    Double[] doubleArray = new Double[input.length];
                    for (int j = 0; j < input.length; j++) {
                        doubleArray[size++] = Double.parseDouble(input[j]);
                    }
                    System.out.println(m.isHeap(doubleArray));
                } else if (type.equals("Integer")) {
                    MinPQ<Integer> m = new MinPQ();
                    Integer[] integerArray = new Integer[input.length];
                    size = 0;
                    for (int j = 0; j < input.length; j++) {
                        integerArray[size++] = Integer.parseInt(input[j]);
                    }
                    System.out.println(m.isHeap(integerArray));
                }
            }
            i++;
        }
    }
}
