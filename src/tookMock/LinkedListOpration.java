package tookMock;

public class LinkedListOpration {
	Node1 head;

	public void insertElement(int data) {
		Node1 tmp;
		Node1 node = new Node1(data);
		if (head == null) {
			head = node;
		} else {
			tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
		}
	}

	public void addAtFirstPosition(int data) {
		Node1 newNode = new Node1(data);
		if (head == null) {
			head = newNode;
		}
		Node1 tmp = head;
		newNode.next = tmp;
		head = newNode;
	}

	public void addPossition(int poss, int data) {
		Node1 newNode = new Node1(data);
		Node1 tmp = head;
		for (int i = 1; i <= poss; i++) {
			tmp = tmp.next;
		}
		newNode.next = tmp.next;
		tmp.next = newNode;
	}

	public void dltFrst() {
		if (head == null) {
			System.out.println("there is no any values");
		}
		head = head.next;
	}

	public void dltLast() {
		Node1 tmp = head;
		if (head == null) {
			System.out.println("there is no any values");
		}
		while (tmp.next.next != null) {
			tmp = tmp.next;
		}
		tmp.next = null;
	}

	public void dltposs(int poss) {
		Node1 tmp = head;
		if (head == null) {
			System.out.println("there is no any values");
		}
		for (int i = 1; i <= poss; i++) {
			tmp = tmp.next;
		}
		tmp.next = tmp.next.next;
	}

	public void rvrsll() {
		Node1 tmp, prev, cur;
		if (head == null) {
			System.out.println("there is no any values");
		}
		prev = null;
		cur = head;
		tmp = cur.next;
		while (tmp != null) {
			cur.next = prev;
			prev = cur;
			cur = tmp;
			tmp = tmp.next;
		}
		cur.next = prev;
		head = cur;

	}

	public void show() {
		Node1 tmp = head;
		while (tmp.next != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
		System.out.println(tmp.data);
	}
}
