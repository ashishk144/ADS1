import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for pairs.
 */
class Pairs {
    /**
     * An array to store elements.
     */
    private int[] arr;
    /**
     * to keep track of size of array.
     */
    private int size;
    /**
     * Constructs the pairs class.
     *
     * @param      n     {size of array}
     */
    public Pairs(int n) {
        arr = new int[n];
        size = 0;
    }
    /**
     * Adds an integer to the array.
     *
     * @param      k     {value of integer}
     */
    public void add(int k) {
        arr[size++] = k;
    }
    /**
     * Returns count of the pairs.
     *
     * @return     {Returns count of the pairs}
     */
    public int getcount() {
        int sum = 0, count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count += 1;
            } else {
                sum += (count * (count + 1)) / 2;
                count = 0;
            }
            if (i == arr.length - 2) {
                sum += (count * (count + 1)) / 2;
            }
        }
        return sum;
    }
}

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
     * Main function to take input and display output.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Pairs sum = new Pairs(n);
        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();
            sum.add(k);
        }
        System.out.println("Sum = " + sum.getcount());
    }
}