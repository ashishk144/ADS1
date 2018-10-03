import java.util.*;
public class MergeSort {
    MergeSort() {

    }
    public void sort(Comparable[] arr) {
        Comparable[] auxi = arr.clone();
        int low = 0;
        int high = arr.length - 1;
        sort(arr, auxi, low, high);
    }
    public void sort(Comparable[] array, Comparable[] aux, int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            aux[i] = array[i];
            count++;
        }
        if(count < 7) {
            Insertion ins = new Insertion();
            ins.sort(aux, count);
            for (int i = low; i <= high; i++) {
                array[i] = aux[i];
            }
            return;
        }
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(array, aux, low, mid);
        sort(array, aux, mid + 1, high);
        if(less(aux[mid+1],aux[mid])) {
            System.out.println("Array is already sorted. So, skipped the call to merge...");
            return;
        }
        merge(array, aux, low, mid, high);
    }
    public void merge(Comparable[] array, Comparable[] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > hi) {
                array[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                array[k] = aux[j++];
            } else {
                array[k] = aux[i++];
            }
        }
    }
    public void bottomUp(Comparable[] arr) {
        int n = arr.length;
        Comparable[] auxiliary = new Comparable[n];
        for (int sz = 1; sz < n; sz += sz) {
            for (int j = 0; j < n - sz; j += sz + sz) {
                merge(arr, auxiliary, j, j + sz - 1, Math.min(j + sz + sz - 1, n - 1));
            }
        }
    }
    public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
