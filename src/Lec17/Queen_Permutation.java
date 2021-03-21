package Lec17;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queenper(new boolean[4], 0, 2, "");
	}

	public static void Queenper(boolean[] board, int qpsf, int tq, String ans) {
        if(tq==qpsf) {
        	System.out.println(ans);
        	return ;
        }
		for (int i = 0; i < board.length; i++) {
          if(board[i]==false) {
        	  board[i]=true;
        	  Queenper(board, qpsf+1, tq, ans+"b"+i+"q"+qpsf);
        	  board[i]=false;
          }
		}

	}
}
