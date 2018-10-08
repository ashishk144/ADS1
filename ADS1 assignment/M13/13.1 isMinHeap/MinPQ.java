/**
 * Class for minimum pq.
 *
 * @param      <E>   { parameter_description }
 */
public class MinPQ<E> {
    /**
     * Constructs the object.
     */
    MinPQ() {

    }
    /**
     * Determines if heap.
     *
     * @param      a     Array
     *
     * @return     True if heap, False otherwise.
     */
    public boolean isHeap(final Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (2 * i + 1 < a.length && 2 * i + 2 < a.length) {
                if (a[i].compareTo(a[2 * i + 1]) > 0
                        || a[i].compareTo(a[2 * i + 2]) > 0) {
                    return false;
                }
            }

        }
        return true;
    }
}