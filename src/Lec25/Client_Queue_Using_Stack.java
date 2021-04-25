package Lec25;

public class Client_Queue_Using_Stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue_Using_Stack qs=new Queue_Using_Stack();
//		System.out.println(qs.GetFront());
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		System.out.println(qs.GetFront());
		qs.Display();

	}

}
