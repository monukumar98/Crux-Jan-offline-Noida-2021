package Lec28;

import java.util.*;

public class GenericTree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree(null, -1);
	}

	private Node CreateTree(Node parent, int ith) {
		if (parent == null) {
			System.out.println("Enter root node");
		} else {
			System.out.println("Enter data for " + ith + " child of " + parent.data);
		}
		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		System.out.println("Eneter Number of child ?" + node.data);
		int noc = sc.nextInt();// Number of child
		for (int i = 0; i < noc; i++) {
			Node child = CreateTree(node, i);
			node.children.add(child);
		}

		return node;

	}

	public void display() {
		Dispaly(this.root);
	}

	private void Dispaly(Node node) {
		String str = "";
		str += node.data + "-->";
		for (Node child : node.children) {
			str += child.data + ",";
		}
		str += ".";
		System.out.println(str);
		for (Node child : node.children) {
			Dispaly(child);
		}
	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		int ts = 0;
		for (Node child : node.children) {
			ts += size(child);
		}
		return ts + 1;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		int th = -1;
		int[] arr = new int[9];
		for (Node child : node.children) {
			int ch = ht(child);
			th = Math.max(ch, th);
		}
		return th + 1;

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		int max = node.data;
		for (Node child : node.children) {
			int cm = max(child);
			max = Math.max(cm, max);
		}

		return max;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (item == node.data) {
			return true;
		}
		for (Node child : node.children) {
			boolean is_find = find(child, item);
			if (is_find) {
				return true;
			}
		}

		return false;
	}

	public void PerOrder() {
		PerOrder(this.root);
		System.out.println();
	}

	private void PerOrder(Node node) {
		// TODO Auto-generated method stub
		System.out.print(node.data + " ");
		for (Node child : node.children) {
			PerOrder(child);
		}

	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub

		for (Node child : node.children) {
			PostOrder(child);
		}
		System.out.print(node.data + " ");

	}

	public void levelorder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				queue.add(child);

			}
		}
		System.out.println();
	}
	public void levelorderLevelwise() {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				helper.add(child);
			}
			if(queue.isEmpty()) {
				queue=helper;
				helper= new LinkedList<>();
				System.out.println();
			}
		}
		System.out.println();
	}
}
