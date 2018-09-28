import java.util.Arrays;
class List<E> {
    E[] arr;
    int size;
    List() {
        arr = (E[]) new Object[5];
        size = 0;
    }
    public void push(E n) {
        if (size == arr.length) {
            resize(2 * arr.length);
        } else if (size == (arr.length) / 4) {
            resize(arr.length / 2);
        }
        arr[size++] = n;
    }
    public E pop() {
        return arr[--size];
    }
    private void resize (int capacity) {
        arr = Arrays.copyOf(arr, capacity);
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public String toString() {
        String s = "";
        if (size > 0) {
            for (int i = 0; i < size - 1; i++) {
                s += arr[i] + ", ";
            } s += arr[size - 1];
            return s;
        }
        return s;
    }
    public int evaluate(String[] line) {
        List<Integer> ll = new List<Integer>();
        int sum;
        for (int i = 0; i < line.length; i++) {
            if (line[i].equals("+")) {
                if (!(ll.isEmpty())) {
                    int a = ll.pop();
                    int b = ll.pop();
                    sum = 0;
                    sum += a + b;
                    ll.push(sum);
                }
            } else if (line[i].equals("*")) {
                if (!(ll.isEmpty())) {
                    int a = ll.pop();
                    int b = ll.pop();
                    sum = 0;
                    sum += a * b;
                    ll.push(sum);
                }
            } else {
                ll.push(Integer.parseInt(line[i]));
            }
        }
        if(!(ll.isEmpty())) {
            return ll.pop();
        } else {
            return 0;
        }
    }
}