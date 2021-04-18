package Lec24;

public class Client_DynamicQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		for (int i = 1; i < 9; i++) {
			dq.Enqueue(10 * i);
		}
		System.out.println(dq.GetFront());
		dq.Display();
	

	}

}
