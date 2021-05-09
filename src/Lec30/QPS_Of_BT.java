package Lec30;

import Lec29.BinaryTree;

public class QPS_Of_BT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.diameter());
		System.out.println(bt.diameter2());
		System.out.println(bt.is_Blanced());
		System.out.println(bt.is_Blanced2());
//		BinaryTree bt1 = new BinaryTree();
//		bt.flipEquiv(bt1);
		bt.left_view();

	}

}
