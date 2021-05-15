package Lec32;

public class Tree_Build_Pre_in {

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Tree_Build_Pre_in(int[] in, int pre[]) {
		// TODO Auto-generated constructor stub
		this.root = create_tree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node create_tree(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		// TODO Auto-generated method stub
		if (ilo > ihi || plo > phi) {
			return null;
		}

		Node node = new Node();
		node.data = pre[plo];
		int si = -1;
		int nel = 0;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				break;
			}
			nel++;
		}
		node.left = create_tree(pre, plo + 1, plo + nel, in, ilo, si - 1);
		node.right = create_tree(pre, plo + nel + 1, phi, in, si + 1, ihi);
		return node;
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

}
