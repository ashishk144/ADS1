/**
 * Class for Merit.
 */
public class Merit {
    /**
     * Array to store all the students data.
     */
    Student[] array;
    /**
     * To check how much data is added to the array.
     */
    int size;
    /**
     * Constructs the object.
     */
    public Merit() {

    }
    public Merit(final int cap) {
        array = new Student[cap];
        size = 0;
    }
    /**
     * Adds a student to the list.
     *
     * @param      stu   The stu
     */
    public void add(final Student stu) {
        array[size++] = stu;
    }
    /**
     * Function to sort the students in descending order of merit.
     * Complexity O(N^2)
     *
     * @param      arr   The arr
     * @param      n     { parameter_description }
     */
    public void Sort(final Student[] arr, final int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (more(arr, j, j - 1)) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }
    /**
     * Finds which value is lower.
     *
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     *
     * @return     { description_of_the_return_value }
     */
    public boolean more(final Student[] a, final int ind1, final int ind2) {
        return a[ind1].compareTo(a[ind2]) > 0;
    }
    /**
     * Swaps the values in the array.
     *
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     */
    public void swap(final Student[] arr, final int ind1, final int ind2) {
        Student temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    /**
     * Finds the merit list and returns merit list.
     * Complexity(NlogN)
     *
     * @return     String with students info.
     */
    public String meritlist() {
        Sort(array,size);
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i].toString() + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
    /**
     * Allocates the vacancies according to the reqirement.
     * Complexity O(N^2)
     * @param      vac    The vac
     * @param      urvac  The urvac
     * @param      bcvac  The bcvac
     * @param      scvac  The scvac
     * @param      stvac  The stvac
     */
    public String allocation(int vac, int urvac, int bcvac, int scvac, int stvac) {
        int n = vac;
        int count = 0;
        Student[] allocated = new Student[n];
        if(urvac > 0) {
            for(int j = 0; j < urvac; j++) {
                allocated[count] = array[count];
                array[count].allocation = true;
                count++;
                n--;
            }
        }
        for(int i = count; i < size; i++) {
            if(bcvac > 0) {
                if(!(array[i].allocation) && array[i].cat.equals("BC")) {
                    allocated[count++] = array[i];
                    array[i].allocation = true;
                    bcvac--;
                    n--;
                }
            }
            if(scvac > 0) {
                if(!(array[i].allocation) && array[i].cat.equals("SC")) {
                    allocated[count++] = array[i];
                    array[i].allocation = true;
                    scvac--;
                    n--;
                }
            }
            if(stvac > 0) {
                if(!(array[i].allocation) && array[i].cat.equals("ST")) {
                    allocated[count++] = array[i];
                    array[i].allocation = true;
                    stvac--;
                    n--;
                }
            }
        }
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < size; j++) {
                    if(!(array[j].allocation)) {
                        allocated[count++] = array[j];
                        array[j].allocation = true;
                        break;
                    }
                }
            }
        }
        Sort(allocated, count);
        String s = "";
        for(int k = 0; k < count; k++) {
            s += allocated[k].toString() + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
}
