public class MinPQ<E> {
    MinPQ() {
    }
    // E[] array;
    // int n;
    // public MinPQ(E[] inp) {
    //     array = inp;
    //     n = array.length;
    // }
    // private boolean greater(int i, int j) {
    //     return (array[i]).compareTo(array[j]) > 0;
    // }
    // private boolean isMinHeap() {
    //     return isMinHeap(1);
    // }
    // private boolean isMinHeap(int k) {
    //     if (k > n) return true;
    //     int first = 2 * k;
    //     int second = 2 * k + 1;
    //     if (first  <= n && greater(k, first)){
    //         return false;
    //     }
    //     if (second <= n && greater(k, second)) {
    //         return false;
    //     }
    //     return isMinHeap(first) && isMinHeap(second);
    // }
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