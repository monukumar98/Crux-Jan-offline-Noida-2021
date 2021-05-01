package Lec27;

import Lec26.LinkedList;

public class SecondClassofLinkedList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// ll.display();
		LinkedList ll1 = new LinkedList();
		ll1.addlast(100);
		ll1.addlast(21);
		ll1.addlast(371);
		ll1.addlast(42);
		ll1.addlast(415);
		ll1.addlast(56);
		ll1.addlast(571);
		ll1.addlast(5);
		// ll1.display();
//		ll.ReversePonterRecursive();
//		ll.display();
		// ll.MergetwoSortedList(ll1);
//		ll1.display();
//		System.out.println(ll1.mid());
//		ll1.MergeSort();
//		ll1.display();
		LinkedList ll = new LinkedList();
		ll.addlast(1);
		ll.addlast(2);
		ll.addlast(3);
		ll.addlast(4);
		ll.addlast(5);
		ll.addlast(6);
		ll.addlast(7);
		ll.addlast(8);
		ll.display();
		ll.createCycle();
		System.out.println(ll.floydcycleDet());
		//ll.cycleremovel2();
		ll.FloydCycleremovel();
		System.out.println(ll.floydcycleDet());
		ll.display();

	}

}
