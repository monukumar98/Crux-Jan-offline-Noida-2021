package Lec26;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		public Node() {
			// TODO Auto-generated constructor stub
			this.data = 0;
			this.next = null;
		}

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}

	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println(".");
	}

//O(1)
	public void addlast(int item) {
		Node node = new Node(item);
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
			this.size++;
		} else {
			this.tail.next = node;
			this.tail = node;
			this.size++;
		}
	}

//O(1)
	public void addfast(int item) {

		if (this.size == 0) {
			addlast(item);
		} else {
			Node node = new Node(item);
			node.next = this.head;
			this.head = node;
			this.size++;
		}
	}

//O(N)
	public void addatindex(int item, int k) throws Exception {
		if (k < 0 || k > this.size) {
			throw new Exception("Invalid index");
		}
		if (k == 0) {
			addfast(item);
		} else if (k == this.size) {
			addlast(item);
		} else {
			Node node = new Node(item);
			Node sm = GetNode(k - 1);// 2k
			Node smnext = sm.next;// 3k
			sm.next = node;// 6k
			node.next = smnext;// 3k
			this.size++;
		}

	}

//O(1)
	public int getfirst() throws Exception {
		if (this.size == 0)
			throw new Exception("Linked list empty");
		return this.head.data;

	}

	// O(1)
	public int getlast() throws Exception {
		if (this.size == 0)
			throw new Exception("Linked list empty");
		return this.tail.data;

	}

//O(N)
	public int getatindex(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid Index");
		}
		if (k == 0) {
			return getfirst();
		} else if (k == this.size - 1) {
			return getlast();
		} else {
			Node temp = this.head;
			for (int i = 1; i <= k; i++) {
				temp = temp.next;
			}
			return temp.data;
		}

	}

	// O(N)
	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid Index");
		}
		if (k == 0) {
			return this.head;
		} else if (k == this.size - 1) {
			return this.tail;
		} else {
			Node temp = this.head;
			for (int i = 1; i <= k; i++) {
				temp = temp.next;
			}
			return temp;
		}

	}

	public int removefirst() throws Exception {
		if (this.size == 0)
			throw new Exception("Linked list empty");
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.size--;
		return temp.data;

	}

	public int removelast() throws Exception {
		if (this.size == 0)
			throw new Exception("Linked list empty");
		if (this.size == 1) {
			return removefirst();
		} else {
			Node sl = GetNode(this.size - 2);
			int rv = this.tail.data;
			this.tail = sl;
			this.tail.next = null;
			this.size--;
			return rv;
		}

	}

	public int removeatindex(int k) throws Exception {
		if (k < 0 || k >= this.size)
			throw new Exception("Linked list empty");
		if (k == 0) {
			return removefirst();
		} else if (k == this.size - 1) {
			return removelast();
		} else {
			Node sm = GetNode(k - 1);// 2k
			Node deletnode = sm.next;// 6k
			sm.next = deletnode.next;
			deletnode.next = null;
			this.size--;
			return deletnode.data;
		}

	}

	public int size() {
		return size;
	}

	public void ReverseDataI() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node leftnode = GetNode(left);
			Node rightnode = GetNode(right);
			int t = leftnode.data;
			leftnode.data = rightnode.data;
			rightnode.data = t;
			left++;
			right--;
		}
	}

	public void ReversePonterI() throws Exception {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;

		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}
}
