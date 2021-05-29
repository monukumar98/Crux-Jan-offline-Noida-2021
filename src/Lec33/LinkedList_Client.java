package Lec33;

import java.util.ArrayList;

public class LinkedList_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.addlast("hey");
		ll.addlast("hello");
		ll.addlast("bye");
		ll.addlast("hii");
		
		ll.display();
		ArrayList  l = new ArrayList();
		l.add(90);
		l.add("hey");
		System.out.println(l);
		

	}

}
