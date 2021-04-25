package Lec25;

import Lec24.DynamicQueue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Display();
		Queue_reverse(dq);
		dq.Display();
		

	}
	public static void Queue_reverse(DynamicQueue dq) throws Exception {
		if(dq.isempty()) {
			return;
		}
		int item = dq.Dequeue();
		Queue_reverse(dq);
		dq.Enqueue(item);
		
				
	}

}
