public class LinkedList<E> {
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
    Node head;
    int size;
    public LinkedList()  {
        head = null;
        size = 0;
    }
    public void insertAt(E data, int point) throws Exception {
        if (point < 0 || point > size) {
            throw new Exception("Can't insert at this position");
        }
        Node n = new Node(data);
        head = insertAt(n, head, point, 0);
    }
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
    public void reverse() throws Exception {
        if(size == 0) {
            throw new Exception("No elements to reverse.");
        }
        reverse(head, null);
    }
    public void reverse(Node current, Node previous) {
        if(current != null) {
            reverse(current, current.next);
            current.next = previous;
        } else {
            head = previous;
        }
    }
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