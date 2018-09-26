import java.util.Arrays;
/**
 * Class for sorted.
 */
class Sorted {
    /**
     * Constructs the object.
     */
    Sorted() {

    }
    /**
     * Concat function to concat 2 arrays.
     *
     * @param      arr1  The arr 1
     * @param      arr2  The arr 2
     *
     * @return     { description_of_the_return_value }
     */
    public String concat(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] newarray = new int[len];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len) {
            // if (j < arr1.length && j < arr2.length) {
            //     if (arr1[j] < arr2[j]) {
            //         newarray[i] = arr1[j];
            //         newarray[i + 1] = arr2[j];
            //         i += 2;
            //         j++;
            //     } else {
            //         newarray[i] = arr2[j];
            //         newarray[i + 1] = arr1[j];
            //         i += 2;
            //         j++;
            //     }
            // } else if (j < arr1.length) {
            //     newarray[i] = arr1[j];
            //     i++;
            //     j++;
            // } else if (j < arr2.length) {
            //     newarray[i] = arr2[j];
            //     i++;
            //     j++;
            // }
            if (j < arr1.length && k < arr2.length) {
                if (arr1[j] <= arr2[k]) {
                    newarray[i] = arr1[j];
                    j++;
                    i++;
                } else {
                    newarray[i] = arr2[k];
                    k++;
                    i++;
                }
            } else if (j < arr1.length) {
                newarray[i] = arr1[j];
                i++;
                j++;
            } else if (k < arr2.length) {
                newarray[i] = arr2[k];
                i++;
                k++;
            }
        }
        return Arrays.toString(newarray).replaceAll("[\\]\\[ ]", "");
    }
}