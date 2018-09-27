public class LinkedList<E> {
	private class Node {
		E data;
		Node next;
		Node() {

		}
		Node(E data) {
			this.data = data;
		}
		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
	Node head, tail;
	E data;
	int size = 0;
	LinkedList() {

	}
	public void add(E n) {
		Node node = new Node(n, head);
		if (head == null) {
			head = node;
			tail = head;
		}
		head = node;
		size++;
	}
	public String toString() {
		String s = "";
		Node thead = head;
		while (thead.next != null) {
			s += (thead.data);
			thead = thead.next;
		} s += (thead.data);
		return s;
	}
	public E popHead() {
		if (head != null) {
			Node temp = head;
			head = head.next;
			return temp.data;
		}
		return null;
	}
	public E popTail() {
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		E element = temp.next.data;
		temp.next = null;
		tail = temp;
		return element;

	}
	// public void closed() {
	// 	int c = 0;
	// 	System.out.println(size);
	// 	for (int i = 0; i < size; i++) {
	// 		if(!(popHead().equals(popTail()))) {
	// 			break;
	// 		}
	// 		c++;
	// 		System.out.println(c);
	// 	}
	// 	if (c == (size - 1)/2) {
	// 		System.out.println("YES");
	// 	} else {
	// 		System.out.println("NO");
	// 	}
	// }
	public int getsize() {
		return size;
	}
}
