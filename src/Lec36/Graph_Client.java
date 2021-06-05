package Lec36;

import java.util.HashSet;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.add_Edge(1, 2, 10);
		g.add_Edge(1, 4, 6);
		g.add_Edge(2, 3, 20);
		g.add_Edge(4, 3, 30);
		//g.add_Edge(4, 5, 80);
		g.add_Edge(5, 6, 90);
		g.add_Edge(7, 6, 13);
		g.add_Edge(5, 7, 14);
		g.display();
		System.out.println(g.hashPath(1, 6, new HashSet<>()));
	//	g.display();
		g.PrintAllPath(1, 6, new HashSet<>(), "");
		System.out.println(g.BFS(1, 6));
		System.out.println(g.DFS(1, 6));

				

	}

}
