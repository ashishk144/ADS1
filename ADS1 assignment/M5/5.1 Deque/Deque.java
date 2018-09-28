public class Deque<E> {
    private class Node {
        E data;
        Node next;
        Node previous;
        Node() {

        }
        Node(E data) {
            this.data = data;
        }
        Node(E data, Node n) {
            this.data = data;
            this.next = n;
            // this.previous = prev;
        }
    }
    Deque() {

    }
    Node head, tail;
    int size;
    public void pushLeft(E data) {
        Node node = new Node(data, head);
        head = node;
        tail = head;
        size++;
    }
    public void pushRight(E data) {
        Node node = new Node(data, tail);
        head = node;
        tail = head;
        size++;
    }
    public int getSize() {
        return size;
    }
    public E popLeft() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
        return null;
    }
    public E popRight() {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        E element = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return element;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}