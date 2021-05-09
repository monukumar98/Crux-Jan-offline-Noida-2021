package Lec29;

import java.util.LinkedList;
import java.util.Queue;

//import Lec29.BinaryTree.Node;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.display();
//10 true 20 true 50 false true 60 false false false true 30 false true 40 true 70 false false false
		System.out.println(bt.max());
		System.out.println(bt.ht());
		System.out.println(bt.size());
		bt.preOrder();
		System.out.println(">>>>>>>>>>>>>");
		bt.postOrder();
		System.out.println(">>>>>>>>>>>>>");
		bt.inOrder();
		System.out.println(">>>>>>>>>>>>>");
		bt.levelorder();
		System.out.println(">>>>>>>>>>>>>");
		bt.levelorderLevelwise();
		System.out.println(">>>>>>>>>>>>>");
		bt.levelorderZigZag();
//		Queue<Integer> queue = new LinkedList<>();
//		queue.add(10);//Enq
//		queue.add(20);
//		queue.add(30);
//		System.out.println(queue.peek());//get front
//		System.out.println(queue);
//		System.out.println(queue.poll());//deq
//		System.out.println(queue);


	}

}
