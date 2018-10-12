import java.lang.Comparable;
/**
 * Class for bst.
 *
 * @param      <E>   { parameter_description }
 * @param      <V>   { parameter_description }
 */
public class Bst<E extends Comparable<E>, V> {
    /**
     * Class for node.
     */
    private class Node {
        /**
         * Key.
         */
        E key;
        /**
         * Value.
         */
        V val;
        /**
         * Left Node.
         */
        Node left;
        /**
         * Right Node.
         */
        Node right;
        /**
         * Constructs the object.
         */
        Node() {

        }
        /**
         * Constructs the object.
         *
         * @param      k     { parameter_description }
         * @param      v     { parameter_description }
         */
        Node(final E k, final V v) {
            this.key = k;
            this.val = v;
        }
    }

    Node root;
    /**
     * Constructs the object.
     */
    public Bst() {

    }
    /**
     * Adds a key val pair to the Tree.
     *
     * @param      key   The key
     * @param      val   The value
     */
    public void put(E key, V val) {
        root = put(root, key, val);
    }
    /**
     * Adds a key val pair to the Tree.
     *
     * @param      n     { parameter_description }
     * @param      key   The key
     * @param      val   The value
     *
     * @return     { description_of_the_return_value }
     */
    private Node put(Node n, E key, V val) {
        if (n == null) {
            return  new Node(key, val);
        }
        int comp = key.compareTo(n.key);
        if (comp > 0) {
            n.right = put(n.right, key, val);
        } else if (comp < 0) {
            n.left = put(n.left, key, val);
        } else {
            n.val = val;
        }
        return n;
    }
    /**
     * Gets the value of the
     *
     * @param      k     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public V get(E k) {
        return get(root, k);
    }
    private V get (Node r, E k) {
        if (r == null) {
            return null;
        }
        int cmp = k.compareTo(r.key);
        if (cmp > 0) {
            return get(r.right, k);
        } else if (cmp < 0) {
            return get(r.left, k);
        }
        return r.val;
    }
    // public void inorder() { inorder(root); }
    // private void inorder(Node root) {
    //     if (root == null) return;
    //     inorder(root.left);
    //     System.out.println(root.key + " " + root.val);
    //     inorder(root.right);
    // }

}