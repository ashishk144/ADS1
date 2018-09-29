public class LinkedList {
	private class Node {
		int data;
		Node next;
		Node() {

		}
		Node(int data) {
			this.data = data;
		}
		Node(int data, Node n) {
			this.data = data;
			this.next = n;
		}
	}
	private Node head, tail;
	private int size;
	LinkedList() {

	}
	public void push(int data) {
		if(head == null) {
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
	public int pop() {
		if (head != null) {
			Node temp = head;
			head = head.next;
			return temp.data;
		}	
		return 0;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public String toString() {
		Node thead = head;
		String s = "";
		while (thead!= null) {
			s += thead.data;
			thead = thead.next;
		}
		return s;
	}
}