import java.util.Arrays;
import java.lang.Comparable;
/**
 * Class for binary st.
 *
 * @param      <key>    The key
 * @param      <value>  The value
 */
public class BinaryST<Key extends Comparable<Key>, Value> {
    /**
     * Stores the keys.
     */
    private Key[] keys;
    /**
     * Stores the keys.
     */
    private Value[] values;
    /**
     * Size.
     */
    private int size;
    /**
     * Constructs the object.
     */
    public BinaryST() {
        keys = (Key[]) new Comparable[2];
        values = (Value[]) new Object[2];
        size = 0;
    }
    /**
     * Resizes the array.
     *
     * @param      cap   The capability
     */
    private void resize(int cap) {
        keys = Arrays.copyOf(keys, cap);
        values = Arrays.copyOf(values, cap);
    }
    /**
     * Adds the key and allots to the value
     *
     * @param      k     { parameter_description }
     * @param      v     { parameter_description }
     */
    public void put(Key k, Value v) {
        // if (k == null) {
        //     throw new Exception("Null value cannot be a key");
        // }
        
        if (v == null) {
            delete(k);
            return;
        }
        int i = getRank(k);
        if (i < size && keys[i].compareTo(k) == 0) {
            values[i] = v;
            return;
        }
        for (int j = size; j > i; j--)  {
            keys[j] = keys[j-1];
            values[j] = values[j-1];
        }
        keys[i] = k;
        values[i] = v;
        size++;
        if (size == keys.length) {
            resize(2 * size);
        }
    }
    /**
     * Finds the rank of the given key.
     *
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    public int getRank(Key key) {
        // if (k == null) {
        //     throw new Exception("Null value cannot be a key");
        // }
        int lo = 0, hi = size - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int comp = key.compareTo(keys[mid]);
            if (comp > 0) {
                lo = mid + 1;
            } else if (comp < 0) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return lo;
    }
    public Value get(Key a) {
        // if(key == null) {
        //     throw new Exception("No key found")
        // }
        if (isEmpty()) {
            return null;
        }
        int i = getRank(a);
        if (i < size && keys[i].compareTo(a) == 0) {
            return values[i];
        }
        return null;
    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    /**
     * Checks whether the key is in the given array.
     *
     * @param      k     key
     *
     * @return     true/false
     */
    public boolean contains(Key k) {
        return get(k) != null;
    }
    /**
     * Finds the floor of the entered key.
     *
     * @param      k     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public Value getFloor(Key k) {
        if (isEmpty()) {
            return null;
        }
        int i = getRank(k);
        if (i == 0) {
            return null;
        }
        if (i < size && keys[i].compareTo(k) == 0) {
            return values[i];
        }
        return values[i - 1];
    }
    /**
     * Deletes a given key.
     *
     * @param      delkey  The delkey
     */
    public void delete(Key delkey) {
        if (isEmpty()) {
            return;
        }
        int i = getRank(delkey);
        if (i < size && keys[i].compareTo(delkey) != 0) {
            return;
        }
        for (int j = i; j < size - 1; j++)  {
            keys[j] = keys[j + 1];
            values[j] = values[j + 1];
        }
        size--;
        keys[size] = null;
        values[size] = null;
        if (size > 0 && size == keys.length / 4) {
            resize(keys.length / 2);
        }
    }
    /**
     * deletes the minimum value.
     */
    public void deleteMin() {
        if (!(isEmpty())) {
            delete(keys[0]);
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s ="";
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                s += keys[i] + " " + values[i] + "\n";
            }
            return s.substring(0, s.length() - 1);
        }
        return s;
    }
    /**
     * Gets the maximum.
     *
     * @return     The maximum.
     */
    public Key getMax() {
        return keys[size - 1];
    }
}
