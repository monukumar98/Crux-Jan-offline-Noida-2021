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
}
