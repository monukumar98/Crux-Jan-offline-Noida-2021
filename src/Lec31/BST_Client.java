package Lec31;

public class BST_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = { 30, 45, 48, 50, 65, 70, 73, 81 };
		BinarySearchTree bst = new BinarySearchTree(in);
		bst.display();
		System.out.println(">>>>>>>>>>>>>");
		bst.addNode(72);
		//bst.display();
		System.out.println(bst.find(60));
		System.out.println(bst.max());

	}

}
