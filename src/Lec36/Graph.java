package Lec36;

import java.util.*;

public class Graph {
	private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Graph(int v) {
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public int no_of_vertex() {
		return map.size();
	}

	public int no_of_Edge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum = sum + map.get(key).size();
		}
		return sum / 2;
	}

	public void add_Edge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public void add_veterx(int v1) {
		map.put(v1, new HashMap<>());
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void remove_vertex(int v1) {
		for (int key : map.get(v1).keySet()) {
			map.get(key).remove(v1);

		}
		map.remove(v1);

	}

	public boolean Conatins_Edge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}

	public boolean Conatins_Vertex(int v1) {
		return map.containsKey(v1);
	}

	public void display() {
		for (int nbrs : map.keySet()) {
			System.out.println(nbrs + " " + map.get(nbrs));
		}
	}

	public boolean hashPath(int src, int dis, HashSet<Integer> visited) {
		visited.add(src);
		if (src == dis) {
			return true;
		}
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ispath = hashPath(nbrs, dis, visited);
				if (ispath) {
					return ispath;
				}
			}
		}

		return false;
	}

	public void PrintAllPath(int src, int dis, HashSet<Integer> visited, String str) {
		visited.add(src);
		if (src == dis) {
			System.out.println(str + dis);
		}
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintAllPath(nbrs, dis, visited, str + src + " ");

			}
		}
		visited.remove(src);
	}

	public boolean BFS(int src, int dis) {
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(src);
		while (!q.isEmpty()) {
			int rv = q.removeFirst();
			// ignor
			if (visited.contains(rv)) {
				continue;
			}

			// src == dis
			if (rv == dis) {
				return true;
			}
			// visited
			visited.add(rv);

			// nbrs add
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);

				}
			}

		}
		return false;
	}

	public boolean DFS(int src, int dis) {
		HashSet<Integer> visited = new HashSet<Integer>();
		Stack<Integer> q = new Stack<Integer>();
		q.push(src);
		while (!q.isEmpty()) {
			int rv = q.pop();
			// ignor
			if (visited.contains(rv)) {
				continue;
			}

			// src == dis
			if (rv == dis) {
				return true;
			}
			// visited
			visited.add(rv);
			// nbrs add
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.push(nbrs);
				}
			}

		}
		return false;
	}

	public void BFT() {
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.removeFirst();
				// ignor
				if (visited.contains(rv)) {
					continue;
				}

				// ''''-----------''''
				System.out.print(rv + " ");

				// visited
				visited.add(rv);
				// nbrs add
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
		}
		System.out.println();

	}

	public void DFT() {
		HashSet<Integer> visited = new HashSet<Integer>();
		Stack<Integer> q = new Stack<Integer>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.push(src);
			while (!q.isEmpty()) {
				int rv = q.pop();
				// ignor
				if (visited.contains(rv)) {
					continue;
				}

				System.out.print(rv + " ");
				// visited
				visited.add(rv);
				// nbrs add
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.push(nbrs);
					}
				}

			}
		}
		System.out.println();
	}

	public boolean IsCycle() {
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.removeFirst();
				// ignor
				if (visited.contains(rv)) {
					return true;
				}

				// visited
				visited.add(rv);
				// nbrs add
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
		}
		return false;

	}

	public boolean IsConnected() {
		HashSet<Integer> visited = new HashSet<Integer>();
		Stack<Integer> q = new Stack<Integer>();
		int component = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			component++;
			q.push(src);
			while (!q.isEmpty()) {
				int rv = q.pop();
				// ignor
				if (visited.contains(rv)) {
					continue;
				}

				// System.out.print(rv+" ");
				// visited
				visited.add(rv);
				// nbrs add
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.push(nbrs);
					}
				}

			}
		}
		return component == 1;
	}

	public boolean istree() {
		return !IsCycle() && IsConnected();
	}

	public ArrayList<ArrayList<Integer>> GetCC() {
		HashSet<Integer> visited = new HashSet<Integer>();
		Stack<Integer> q = new Stack<Integer>();
		ArrayList<ArrayList<Integer>> bl = new ArrayList<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			ArrayList<Integer> sl = new ArrayList<>();
			bl.add(sl);

			q.push(src);
			while (!q.isEmpty()) {
				int rv = q.pop();
				// ignor
				if (visited.contains(rv)) {
					continue;
				}
				sl.add(rv);

				// visited
				visited.add(rv);
				// nbrs add
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.push(nbrs);
					}
				}

			}
		}
		return bl;
	}

	private class PrimsPair implements Comparable<PrimsPair>{
		int vname;
		int acqvanme;
		int cost;

		public PrimsPair(int vname, int acqvanme, int cost) {
			// TODO Auto-generated constructor stub
			this.vname = vname;
			this.cost = cost;
			this.acqvanme = acqvanme;
		}
		@Override
		public String toString() {
			return this.vname+" vai "+this.acqvanme+" @ "+this.cost;
		}
		@Override
		public int compareTo(PrimsPair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}
	}
	public void primsAlgo() {
		HashSet<Integer> visited = new HashSet<Integer>();
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>();
		pq.add(new PrimsPair(1, 0, 0));
		while(!pq.isEmpty()) {
			PrimsPair p = pq.remove();
			// Ignor
			if(visited.contains(p.vname)) {
				continue;
			}
			if(p.acqvanme!=0)
			System.out.println(p);
			visited.add(p.vname);
			for (int nbrs : map.get(p.vname).keySet()) {
				if(!visited.contains(nbrs)) {
					PrimsPair np = new PrimsPair(nbrs, p.vname, map.get(p.vname).get(nbrs));
					pq.add(np);
				}
			}
		}
	}
	private class DijkstraPair implements Comparable<DijkstraPair>{
		int vname;
		String psf;
		int cost;

		public   DijkstraPair(int vname, String psf, int cost) {
			// TODO Auto-generated constructor stub
			this.vname = vname;
			this.cost = cost;
			this.psf = psf;
		}
		@Override
		public String toString() {
			return this.vname+" vai "+this.psf+" @ "+this.cost;
		}
		@Override
		public int compareTo(DijkstraPair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}
	}
	
	public void DijkstraAlgo() {
		HashSet<Integer> visited = new HashSet<Integer>();
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>();
		pq.add(new DijkstraPair(1, "", 0));
		while(!pq.isEmpty()) {
			DijkstraPair p = pq.remove();
			// Ignor
			if(visited.contains(p.vname)) {
				continue;
			}
			if(p.cost!=0)
			System.out.println(p);
			visited.add(p.vname);
			for (int nbrs : map.get(p.vname).keySet()) {
				if(!visited.contains(nbrs)) {
					DijkstraPair np = new DijkstraPair(nbrs, p.psf+p.vname+" ", map.get(p.vname).get(nbrs)+p.cost);
					pq.add(np);
				}
			}
		}
	}

}
