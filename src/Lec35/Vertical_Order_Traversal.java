package Lec35;

import java.util.*;;

public class Vertical_Order_Traversal {
	static Scanner sc = new Scanner(System.in);

	private class Node {
		Node left;
		Node right;
		int data;
	}

	private Node root;

	public Vertical_Order_Traversal() {
		// TODO Auto-generated constructor stub
		this.root = createNode();
	}

	private Node createNode() {
		int d = sc.nextInt();
		LinkedList<Node> q = new LinkedList<>();
		Node nn = new Node();
		nn.data = d;
		this.root = nn;
		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.getFirst();
			q.removeFirst();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				nn = new Node();
				nn.data = c1;
				node.left = nn;
				q.addLast(node.left);
			}

			if (c2 != -1) {
				nn = new Node();
				nn.data = c2;
				node.right = nn;
				q.addLast(node.right);

			}

		}
		return root;

	}

	public class Pair {
		Node node;
		int hl;
		int vt;

		public Pair(Node node, int hl, int vt) {
			// TODO Auto-generated constructor stub
			this.node = node;
			this.hl = hl;
			this.vt = vt;
		}
	}

	public List<List<Integer>> VerticalOrderTraversal() {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		TreeMap<Integer, ArrayList<Pair>> map = new TreeMap<>();
		LinkedList<Pair> q = new LinkedList<>();
		q.add(new Pair(this.root, 0, 0));
		while (!q.isEmpty()) {
			Pair rp = q.removeFirst();
			if (!map.containsKey(rp.vt)) {
				map.put(rp.vt, new ArrayList<Pair>());
			}
			map.get(rp.vt).add(rp);
			if (rp.node.left != null) {
               Pair lrp= new Pair(rp.node.left, rp.hl+1, rp.vt-1);
               q.add(lrp);
			}
			if (rp.node.right != null) {
				Pair rrp= new Pair(rp.node.right, rp.hl+1, rp.vt+1);
				q.add(rrp);
			}
		}
		
        for(int key:map.keySet()) {
        	ArrayList<Pair> lp =  map.get(key);
        	Collections.sort(lp, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					if(o1.hl==o2.hl) {
						return o1.node.data-o2.node.data;
					}
					return 0;
				}
			});
        	ArrayList<Integer> ll = new ArrayList<Integer>();
        	for(Pair p : lp) {
        		ll.add(p.node.data);
        	}
        	list.add(ll);
        	}
        System.out.println(list);
		
		return list;

	}

	public void display() {
		// System.out.println("---------------");
		display(this.root);
		// System.out.println("---------------");
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "<--";
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

	public static void main(String[] args) {
      
		Vertical_Order_Traversal vt = new Vertical_Order_Traversal();
		vt.VerticalOrderTraversal();
		
	}

}