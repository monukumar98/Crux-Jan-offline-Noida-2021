package Lec35;

import java.util.Collections;
import java.util.PriorityQueue;

public class Demo_Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();//min
		pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);
        pq.add(5);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Collections.reverseOrder());//max
		pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(40);
        pq1.add(50);
        pq1.add(60);
        pq1.add(70);
        pq1.add(5);
        System.out.println(pq1);
        System.out.println(pq1.remove());
        System.out.println(pq1);

	}

}
