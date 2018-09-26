import java.util.Arrays;
/**
 * Class for threesum.
 */
public class Threesum {
    /**
     * initiating array.
     */
    private int[] arr;
    /**
     * Keeping track of size.
     */
    private int size;
    /**
     * keeping track of count.
     */
    private int count;
    /**
     * Constructs the object.
     *
     * @param      n     { size of array }
     */
    public Threesum(final int n) {
        arr = new int[n];
        size = 0;
    }
    /**
     * Adds object to array.
     *
     * @param      k     { value }
     */
    public void add(final int k) {
        arr[size++] = k;
    }
    /**
     * Returns count.
     *
     * @return     { count }
     */
    public int getcount() {
        // for(int i = 0; i < arr.length - 2; i++) {
        //     for (int j = i + 1; j < arr.length - 1; j++) {
        //         for(int k = j + 1; k < arr.length; k++) {
        //             if (arr[i]+arr[j]+arr[k] == 0) {
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // return count;
        Arrays.sort(arr);
        for (int k = 0; k < arr.length; k++) {
            int i = 0;
            int j = arr.length - 1;
            while (j != k && i != k && i < j) {
                if (arr[i] + arr[j] == -arr[k]) {
                    count++;
                    i++;
                } else if (arr[i] + arr[j] > -arr[k]) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}
