package Lec25;

import Lec24.DynamicQueue;

public class Stack_Using_Queue {
	private DynamicQueue pri;
	private DynamicQueue sec;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		pri = new DynamicQueue();
		sec = new DynamicQueue();
	}

	public int size() {
		return pri.size();
	}

	public boolean isempty() {
		return pri.isempty();
	}

	// O(n)
	public void push(int item) throws Exception {
		sec.Enqueue(item);
		while (!pri.isempty()) {
			sec.Enqueue(pri.Dequeue());
		}
		pri = sec;
		sec = new DynamicQueue();

	}

// O(1)
	public int pop() throws Exception {
		if (pri.isempty()) {
			throw new Exception("Stack is empty");
		}
		return pri.Dequeue();
	}

// O(1)
	public int peek() throws Exception {
		if (pri.isempty()) {
			throw new Exception("Stack is empty");
		}
		return pri.GetFront();
	}

	public void display() throws Exception {
		Queue_reverse();
		pri.Display();
		Queue_reverse();
	}

	public void Queue_reverse() throws Exception {
		if (pri.isempty()) {
			return;
		}
		int item = pri.Dequeue();
		Queue_reverse();
		pri.Enqueue(item);

	}
}
