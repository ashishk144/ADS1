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
			size--;
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
		size--;
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
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean closed(String[] line) {
		LinkedList<String> ll =new LinkedList<String>();
		for (int j = 0; j < line.length; j++) {
                // System.out.println(line[j]);
                if (line[j].equals("[") || line[j].equals("(") || line[j].equals("{")) {
                    ll.add(line[j]);
                } else if (line[j].equals("]")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("["))) {
                        return false;
                    }
                } else if (line[j].equals(")")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("("))) {
                        return false;
                    }
                } else if (line[j].equals("}")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("{"))) {
                        return false;
                    }
                }
            }
            if (ll.isEmpty()) {
            	return true;
            } else {
            	return false;
            }
	}
}
