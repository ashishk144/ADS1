import java.util.Arrays;

public class Threesum {
    private long[] arr;
    private int size;
    private int count;
    public Threesum(int n) {
        arr = new long[n];
        size = 0;
    }
    public void add(int k) {
        arr[size++] = k;
    }
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
