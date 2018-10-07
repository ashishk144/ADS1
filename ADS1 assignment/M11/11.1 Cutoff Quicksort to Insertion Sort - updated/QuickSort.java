import java.util.Arrays;

public class QuickSort {
    QuickSort() {

    }
    public int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) {
                if (i >= hi) {
                    break;
                }
            }
            while (less(a[lo], a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(a, j, i);
        }
        swap(a, lo, j);
        System.out.println(Arrays.toString(a));
        return j;
    }
    public void sort(Comparable[] a, int cutoff) {
        int lo = 0;
        int hi = a.length - 1;
        if(hi > 0) {
            sort(a, lo, hi, cutoff);
        } else {
            return;
        }
    }
    public void sort(Comparable[] arr, int lo, int hi, int cut) {
        // if (hi <= lo) {
        //     return;
        // }
        if (hi <= lo + cut - 1) {
            Insertion ins = new Insertion();
            ins.sort(arr, lo, hi);
            return;
        }
        int mid = partition(arr, lo, hi);
        sort(arr, lo, mid - 1, cut);
        sort(arr, mid + 1, hi, cut);
    }
    public boolean less(Comparable x, Comparable y) {
        return x.compareTo(y) < 0;
    }
    public void swap(Comparable[] a, int i1, int i2) {
        Comparable temp = a[i2];
        a[i2] = a[i1];
        a[i1] = temp;
    }
}
