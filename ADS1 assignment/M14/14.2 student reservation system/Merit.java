/**
 * Class for Merit.
 */
public class Merit {
    /**
     * Array to store all the students data.
     */
    private Student[] array;
    /**
     * To check how much data is added to the array.
     */
    private int size;
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
    public String meritlist() {
        Heap h = new Heap(array, size);
        array = h.sort();
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
        if (urvac > 0) {
            for (int j = 0; j < urvac; j++) {
                allocated[count] = array[count];
                array[count].allocation = true;
                count++;
                n--;
            }
        }
        for (int i = count; i < size; i++) {
            if (bcvac > 0) {
                if (!(array[i].allocation) && array[i].cat.equals("BC")) {
                    allocated[count++] = array[i];
                    array[i].allocation = true;
                    bcvac--;
                    n--;
                }
            }
            if (scvac > 0) {
                if (!(array[i].allocation) && array[i].cat.equals("SC")) {
                    allocated[count++] = array[i];
                    array[i].allocation = true;
                    scvac--;
                    n--;
                }
            }
            if (stvac > 0) {
                if (!(array[i].allocation) && array[i].cat.equals("ST")) {
                    allocated[count++] = array[i];
                    array[i].allocation = true;
                    stvac--;
                    n--;
                }
            }
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < size; j++) {
                    if (!(array[j].allocation)) {
                        allocated[count++] = array[j];
                        array[j].allocation = true;
                        break;
                    }
                }
            }
        }
        Heap h = new Heap(allocated, count);
        h.sort();
        String s = "";
        for (int k = 0; k < count; k++) {
            s += allocated[k].toString() + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
}
