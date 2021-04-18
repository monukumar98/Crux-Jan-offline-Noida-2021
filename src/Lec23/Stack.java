package Lec23;

public class Stack {
	protected int[] data;
	private int tos;

	public Stack() {
		this.data = new int[5];
		this.tos = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public boolean isempty() {
		return this.tos == -1;
	}

	public boolean isfull() {
		return this.tos == this.data.length - 1;
	}

	public int size() {
		return this.tos + 1;
	}

	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Stack is Full");
		}
		this.tos++;
		this.data[this.tos] = item;

	}

	public int pop() throws Exception {
		if (isempty()) {
			throw new Exception("Stack is empty");
		}

		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		tos--;
		return rv;

	}

	public int peek() throws Exception {
		if (isempty()) {
			throw new Exception("Stack is empty");
		}
		return this.data[this.tos];
	}

	public void display() {
		for (int i = 0; i <= tos; i++) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println(".");
	}
}
