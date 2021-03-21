package Lec17;

public class Queen_Combination_with_respect_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queen_Comb_with_resp_box(new boolean[4], 0,2, "", 0);

	}
	public static void Queen_Comb_with_resp_box(boolean [] board,int qpsf,int tq,String ans,int i) {
	    
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		if(i>=board.length) {
			return;
		}
		// yes
		board[i]=true;
		Queen_Comb_with_resp_box(board, qpsf+1, tq, ans+"b"+i,i+1);
		board[i]=false;
		//no
		Queen_Comb_with_resp_box(board, qpsf, tq, ans,i+1);

	}
	

}
