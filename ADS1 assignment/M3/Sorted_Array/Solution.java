import java.util.Scanner;
import java.util.Arrays;
class Sorted {
    Sorted() {

    }
    public String concat(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] newarray = new int[len];
        for (int i = 0; i < len - 1; i++) {
            if (arr1[i] > arr2[i]) {
                newarray[i] = arr1[i];
                newarray[i + 1] = arr2[i];
            }
        }
        return Arrays.toString(newarray);
    }
}
public class Solution {
    private Solution() {

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = Integer.parseInt(scan.nextLine());
        int q = Integer.parseInt(scan.nextLine());
        String[] list1 = scan.nextLine().split(",");
        String[] list2 = scan.nextLine().split(",");
        int[] arr1 = new int[p];
        int[] arr2 = new int[q];
        if (p != 0) {
            for (int i = 0; i < list1.length; i++) {
                arr1[i] = Integer.parseInt(list1[i]);
            }
        }
        if (q != 0) {
            for (int i = 0; i < list2.length; i++) {
                arr2[i] = Integer.parseInt(list2[i]);
            }
        }
        Sorted sortedarray = new Sorted();
        System.out.println(sortedarray.concat(arr1, arr2));
    }
}