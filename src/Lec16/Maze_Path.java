package Lec16;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazePath(0, 0, 2, 2, "");

	}
	public static void MazePath(int cc,int cr,int ec,int er,String ans) {
		if(cc==ec&&cr==er) {
			System.out.println(ans);
			return ;
		}
		if(cc>ec || cr >er) {
			return ;
		}
		MazePath(cc+1, cr, ec, er, ans+"H");
		MazePath(cc, cr+1, ec, er, ans+"V");
	}

}
