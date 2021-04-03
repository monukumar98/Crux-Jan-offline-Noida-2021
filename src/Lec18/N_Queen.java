package Lec18;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean [][] board = new boolean[4][4];
		nQueen(board, n, 0);

	}
	public static void nQueen(boolean [][] board, int n,int row) {
		if(n==0) {
			Display(board);
			System.out.println();
			return;
		}
		if(row==board.length) {
			return;
		}
		
		for (int col = 0; col < board.length; col++) {
			if(is_safe(board,col,row)) {
				board[row][col]=true;
			nQueen(board, n-1,row+1);
			board[row][col]=false;

			}
		}
	}
	public static boolean is_safe(boolean [][] board, int col,int row) {
		// left diagonal
		int c =col;
		int r =row;
		while(r>=0 && c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		//  right diagonal
		 r=row;
		 c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		// vertical
		r=row;
		while(r>=0) {
			if(board[r][col]) {
				return false;
			}
			r--;
			
		}
		return true;
		
	}
	public  static void Display(boolean [][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

}
}
