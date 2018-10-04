/**
 * List of linkeds.
 *
 * @param      <E>   { parameter_description }
 */
public class LinkedList<E> {
    /**
     * Class for node.
     */
    private class Node {
        E data;
        Node next;
        Node() {

        }
        Node(E data) {
            this.data = data;
        }
        Node(E data, Node n) {
            this.data = data;
            this.next = n;
        }
    }
    /**
     * Head node.
     */
    Node head;
    /**
     * Size of the List.
     */
    int size;
    /**
     * Constructs the object.
     */
    public LinkedList()  {
        head = null;
        size = 0;
    }
    /**
     * Inserts the data at a particular position.
     *
     * Complexity N
     * @param      data       The data
     * @param      point      The point
     *
     * @throws     Exception  { exception_description }
     */
    public void insertAt(E data, int point) throws Exception {
        if (point < 0 || point > size) {
            throw new Exception("Can't insert at this position.");
        }
        Node n = new Node(data);
        head = insertAt(n, head, point, 0);
    }
    /**
     * Complexity N
     *
     * @param      node   The node
     * @param      first  The first
     * @param      pos    The position
     * @param      count  The count
     *
     * @return     { description_of_the_return_value }
     */
    public Node insertAt(Node node, Node first, int pos, int count) {
        if (pos == count) {
            node.next = first;
            size += 1;
            return node;
        } else {
            first.next = insertAt(node, first.next, pos, count + 1);
            return first;
        }
    }
    /**
     * Reverses the list.
     *
     *
     * @throws     Exception  { exception_description }
     */
    public void reverse() throws Exception {
        if (size == 0) {
            throw new Exception("No elements to reverse.");
        }
        reverse(head, null);
    }
    /**
     * Reverses the vaslues.
     *
     * Complexity N.
     * @param      current   The current
     * @param      previous  The previous
     */
    public void reverse(Node current, Node previous) {
        if (current != null) {
            reverse(current.next, current);
            current.next = previous;
        } else {
            head = previous;
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * Complexity N
     * @return     String representation of the object.
     */
    public String toString() {
        Node thead = head;
        String s = "";
        while (thead != null) {
            s += thead.data + ", ";
            thead = thead.next;
        }
        return s.substring(0, s.length() - 2);
    }
}