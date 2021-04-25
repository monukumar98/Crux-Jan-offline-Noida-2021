package Lec25;

import Lec24.DynamicStack;

public class Queue_Using_Stack {
	private DynamicStack pri;
	private DynamicStack sec;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		pri = new DynamicStack();
		sec = new DynamicStack();
	}

	public int size() {
		return pri.size();
	}

	public boolean isempty() {
		return pri.isempty();
	}

	// O(1)
	public void Enqueue(int item) throws Exception {
		pri.push(item);
	}

	// O(N)
	public int dequeue() throws Exception {
		if(pri.isempty()) {
			throw new Exception("Queue kahli hai");
		}
		while (pri.size() != 1) {
			sec.push(pri.pop());
		}
		int rv = pri.pop();
		while (!sec.isempty()) {
			pri.push(sec.pop());
		}
		return rv;

	}

	// O(N)
	public int GetFront() throws Exception {
		if(pri.isempty()) {
			throw new Exception("Queue kahli hai");
		}
		while (pri.size() != 1) {
			sec.push(pri.pop());
		}
		int rv = pri.peek();
		while (!sec.isempty()) {
			pri.push(sec.pop());
		}
		return rv;

	}
	public void Display() {
		pri.display();
	}
}
