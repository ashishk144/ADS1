/**
 * Class for Insertion.
 */
public class Insertion {
    /**
     * Constructs the object.
     */
    public Insertion() {

    }
    /**
     * Insertion Sort function for array.
     * Omega(N)
     * Theta(N^2)
     * O(N^2)
     * @param      array  The array
     * @param      size   The size
     */
    public void sort(Comparable[] array, int size) {
        System.out.println("Insertion sort method invoked...");
        int n = size;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (less(array, j, j - 1)) {
                    swap(array, j, j - 1);
                }
            }
        }
    }
    /**
     * Finds which value is lower.
     *
     * @param      arr   The arr
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     *
     * @return     { description_of_the_return_value }
     */
    public boolean less(Comparable[] arr, int ind1, int ind2) {
        return arr[ind1].compareTo(arr[ind2]) < 0;
    }
    /**
     * Swaps the values in the array.
     *
     * @param      a     Team array
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     */
    public void swap(Comparable[] a, int ind1, int ind2) {
        Comparable temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
}
