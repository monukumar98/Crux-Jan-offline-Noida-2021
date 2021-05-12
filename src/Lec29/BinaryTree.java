package Lec29;

import java.util.*;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = create_Tree(null, false);
	}

	private Node create_Tree(Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enete root Node data");
		}

		else if (ilc) {
			System.out.println("Eneter data of  left  chlid  " + parent.data);
		} else {
			System.out.println("Eneter data of  right  chlid  " + parent.data);

		}
		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		node.left = null;
		node.right = null;
		System.out.println("Has a left chid ?? " + node.data);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			node.left = create_Tree(node, true);
		}
		System.out.println("Has a right chid ?? " + node.data);
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			node.right = create_Tree(node, false);
		}
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

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}

		int left = ht(node.left);
		int right = ht(node.right);
		return Math.max(right, left) + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int left_max = max(node.left);
		int right_max = max(node.right);
		return Math.max(left_max, Math.max(right_max, node.data));

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		int left = size(node.left);
		int right = size(node.right);
		return right + left + 1;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean isleft = find(node.left, item);
		boolean isright = find(node.right, item);

		return isleft || isright;
	}

	public void preOrder() {
		preOrder(this.root);
		System.out.println();
	}

	private void preOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);

	}

	public void inOrder() {
		inOrder(this.root);
		System.out.println();
	}

	private void inOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);

	}

	public void postOrder() {
		postOrder(this.root);
		System.out.println();
	}

	private void postOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");

	}

	public void levelorder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.remove();
			System.out.print(rn.data + " ");
			if (rn.left != null) {
				queue.add(rn.left);
			}

			if (rn.right != null) {
				queue.add(rn.right);
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
			if (rn.left != null) {
				helper.add(rn.left);
			}
			if (rn.right != null) {
				helper.add(rn.right);
			}
			if (queue.isEmpty()) {
				queue = helper;
				helper = new LinkedList<>();
				System.out.println();
			}
		}
		System.out.println();
	}

	public void levelorderZigZag() {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> stack = new LinkedList<>();
		int count = 0;
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			if (count % 2 == 0) {
				if (rn.left != null) {
					stack.addFirst(rn.left);
				}
				if (rn.right != null) {
					stack.addFirst(rn.right);
				}
			} else {
				if (rn.right != null) {
					stack.addFirst(rn.right);
				}
				if (rn.left != null) {
					stack.addFirst(rn.left);
				}
			}

			if (queue.isEmpty()) {
				queue = stack;
				stack = new LinkedList<>();
				System.out.println();
				count++;
			}
		}
		System.out.println();
	}

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}

		int ld = diameter(node.left);
		int rd = diameter(node.right);
		int sp = ht(node.left) + ht(node.right) + 2;
		return Math.max(rd, Math.max(ld, sp));

	}

	private class DiaPair {
		int diameter = 0;
		int ht = -1;
	}

	public int diameter2() {
		return diameter2(this.root).diameter;
	}

	private DiaPair diameter2(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new DiaPair();
		}

		DiaPair ldp = diameter2(node.left);
		DiaPair rdp = diameter2(node.right);
		DiaPair sdp = new DiaPair();
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
		int sp = ldp.ht + rdp.ht + 2;
		sdp.diameter = Math.max(sp, Math.max(ldp.diameter, rdp.diameter));
		return sdp;

	}

	public boolean is_Blanced() {
		return is_Blanced(this.root);
	}

	private boolean is_Blanced(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return true;
		}
		boolean is_left_bal = is_Blanced(node.left);
		boolean is_right_bal = is_Blanced(node.right);
		int bf = Math.abs(ht(node.left) - ht(node.right));
		if (is_left_bal && is_right_bal && bf <= 1) {
			return true;
		}
		return false;

	}

	private class BalPair {
		boolean isbalance = true;
		int ht = -1;
	}

	public boolean is_Blanced2() {
		return is_Blanced2(this.root).isbalance;
	}

	private BalPair is_Blanced2(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new BalPair();
		}
		BalPair is_left_bal = is_Blanced2(node.left);
		BalPair is_right_bal = is_Blanced2(node.right);
		BalPair sbp = new BalPair();
		sbp.ht = Math.max(is_left_bal.ht, is_right_bal.ht) + 1;
		int bf = Math.abs(is_left_bal.ht - is_right_bal.ht);
		sbp.isbalance = (is_left_bal.isbalance && is_right_bal.isbalance && bf <= 1);
		return sbp;

	}

	public boolean flipEquiv(BinaryTree other) {
		return flipEquiv(this.root, other.root);
	}

	private boolean flipEquiv(Node node1, Node node2) {
		// TODO Auto-generated method stub
		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 == null || node2 == null) {
			return false;
		}
		if (node1.data != node2.data) {
			return false;
		}
		boolean flip = flipEquiv(node1.left, node2.right) && flipEquiv(node1.right, node2.left);
		boolean notflip = flipEquiv(node1.left, node2.left) && flipEquiv(node1.right, node2.right);
		return flip || notflip;
	}

	static int max_level = -1;

	public void left_view() {
		left_view(this.root, 0);
		System.out.println();
	}

	private void left_view(Node node, int level) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		if (max_level < level) {
			System.out.print(node.data + " ");
			max_level = level;
		}
		left_view(node.left, level + 1);
		left_view(node.right, level + 1);

	}

	public int min() {
		return min(this.root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int left_min = min(node.left);
		int right_min = min(node.right);
		return Math.min(left_min, Math.min(right_min, node.data));

	}

	public boolean is_Bst() {
		return is_Bst(this.root);
	}

	private boolean is_Bst(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return true;
		}
		boolean lbst = is_Bst(node.left);
		boolean rbst = is_Bst(node.right);
		int left_max = max(node.left);
		int right_min = min(node.right);
		if (lbst && rbst && left_max < node.data && right_min > node.data) {
			return true;
		}
		return false;
	}

	private class BstPair {
		boolean isbst = true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int size=0;
		int ans=0;

	}

	public boolean is_Bst2() {
		return is_Bst2(this.root).isbst;
	}

	private BstPair is_Bst2(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new BstPair();
		}
		BstPair lbstp = is_Bst2(node.left);
		BstPair rbstp = is_Bst2(node.right);
		BstPair sbstp = new BstPair();
		if (lbstp.isbst && rbstp.isbst && lbstp.max < node.data && rbstp.min > node.data) {
			sbstp.isbst = true;
			sbstp.min = Math.min(lbstp.min, Math.min(rbstp.min, node.data));
			sbstp.max = Math.max(lbstp.max, Math.max(rbstp.max, node.data));

		}
		sbstp.isbst = false;
		
		return sbstp;

	}
	public int sizeofbstinbt() {
		return sizeofbstinbt(this.root).ans;
	}
	private BstPair sizeofbstinbt(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new BstPair();
		}
		BstPair lbstp = sizeofbstinbt(node.left);
		BstPair rbstp = sizeofbstinbt(node.right);
		BstPair sbstp = new BstPair();
		sbstp.size=lbstp.size+rbstp.size+1;
		if (lbstp.isbst && rbstp.isbst && lbstp.max < node.data && rbstp.min > node.data) {
			sbstp.isbst = true;
			sbstp.min = Math.min(lbstp.min, Math.min(rbstp.min, node.data));
			sbstp.max = Math.max(lbstp.max, Math.max(rbstp.max, node.data));
			sbstp.ans=sbstp.size;

		}
		sbstp.isbst = false;
		sbstp.ans=Math.max(lbstp.ans, rbstp.ans);
		return sbstp;

	}
}
