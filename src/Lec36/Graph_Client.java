package Lec36;

import java.util.HashSet;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.add_Edge(1, 2, 2);
		g.add_Edge(1, 4, 10);
		g.add_Edge(2, 3, 3);
		g.add_Edge(4, 3, 1);
		g.add_Edge(4, 5, 8);
		g.add_Edge(5, 6, 5);
		g.add_Edge(7, 6, 1);
		g.add_Edge(5, 7, 1);
	//	g.add_veterx(9);
		g.display();
		// g.removeEdge(4, 3);
		//g.removeEdge(4, 5);

		System.out.println(g.hashPath(1, 6, new HashSet<>()));
		// g.display();
		// g.PrintAllPath(1, 6, new HashSet<>(), "");
//		System.out.println(g.BFS(1, 6));
//		System.out.println(g.DFS(1, 6));
		g.BFT();
		g.DFT();
		System.out.println(g.IsCycle());
		System.out.println(g.IsConnected());
		System.out.println(g.istree());
		System.out.println(g.GetCC());
		g.primsAlgo();
		
		System.out.println("..........");
		g.DijkstraAlgo();

	}

}
