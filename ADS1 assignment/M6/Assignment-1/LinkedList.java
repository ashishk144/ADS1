public class LinkedList {
    /**
     * Class for node.
     */
	private class Node {
		int data;
		Node next;
        /**
         * Constructs the object.
         */
		Node() {

		}
        /**
         * Constructs the object.
         *
         * @param      data  The data
         */
		Node(int data) {
			this.data = data;
		}
        /**
         * Constructs the object.
         *
         * @param      data  The data
         * @param      n     { parameter_description }
         */
		Node(int data, Node n) {
			this.data = data;
			this.next = n;
		}
	}
	private Node head, tail;
	private int size;
    /**
     * Constructs the object.
     */
	LinkedList() {

	}
    /**
     * Pushes an object at tail.
     *
     * @param      data  The data
     */
	public void push(int data) {
		if (head == null) {
			head = new Node(data);
			tail = head;
			size++;
			return;
		}
		Node node = new Node(data, null);
		tail.next = node;
		tail = node;
		size++;
	}
    /**
     * Pushes at head.
     *
     * @param      data  The data
     */
    public void pushHead(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(data, head);
        head = node;
        size++;
    }
    /**
     * Pops out the object.
     *
     * @return     { description_of_the_return_value }
     */
	public int pop() {
		if (head != null) {
			Node temp = head;
			if(size > 1) {
				while (temp.next != tail) {
					temp = temp.next;
				}
			}
			int val = tail.data;
			temp.next = null;
			tail = temp;
			size--;
			return val;
		}
		return 0;
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
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
	public String toString() {
		Node thead = head;
		String s = "";
		while (thead != null) {
			s += thead.data;
			thead = thead.next;
		}
		return s;
	}
    /**
     * Gets the size.
     *
     * @return     The size.
     */
	public int getSize() {
		return size;
	}
}