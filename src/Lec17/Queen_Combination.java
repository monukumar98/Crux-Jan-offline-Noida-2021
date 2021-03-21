package Lec17;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenCombination(new boolean[4], 0, 2, "", -1);

	}

	public static void QueenCombination(boolean[] board, int qpsf, int tq, String ans,int idx) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = idx+1; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				QueenCombination(board, qpsf + 1, tq, ans + "b" + i + "q" + qpsf,i);
				board[i] = false;
			}
		}
	}

}
