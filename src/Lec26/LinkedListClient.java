package Lec26;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addlast(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.addlast(40);
		ll.addfast(50);
//		ll.display();
//		System.out.println(ll.getfirst());
//		System.out.println(ll.getlast());
//		System.out.println(ll.getatindex(2));
		ll.addatindex(70, 3);
		ll.display();
//		System.out.println(ll.removefirst());
//		ll.display();
//		System.out.println(ll.removelast());
//		ll.display();
//		System.out.println(ll.removeatindex(2));
//		ll.display();
//		System.out.println(ll.size());
//		ll.ReverseDataI();
		ll.ReversePonterI();
		ll.display();

	}

}
