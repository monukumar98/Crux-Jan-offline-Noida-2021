package Lec30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree_Build_level_Ordder {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Tree_Build_level_Ordder() {
		// TODO Auto-generated constructor stub
		this.root = Create_Tree();
	}

	private Node Create_Tree() {
		// TODO Auto-generated method stub
		Queue<Node> queue = new LinkedList<>();
		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		this.root = node;
		queue.add(node);
		while (!queue.isEmpty()) {
			Node rn = queue.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				node = new Node();
				node.data = c1;
				rn.left = node;
				queue.add(rn.left);
			}
			if (c2 != -1) {
				node = new Node();
				node.data = c2;
				rn.right = node;
				queue.add(rn.right);
			}
		}

		return root;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data + "<--";
		} else {
			str += ".<--";
		}
		str += node.data + "-->";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public Node lowestCommonAncestor(Node node, Node p, Node q) {
		if (node == null) {
			return node;
		}
		if (node == p || node == q) {
			return node;
		}
		Node left = lowestCommonAncestor(node.left, p, q);
		Node right = lowestCommonAncestor(node.right, p, q);
		if(left!=null && right!=null) {
			return node;
		}
		else if(left!=null) {
			return left;
		}
		else {
			return right;
		}
	}

}
