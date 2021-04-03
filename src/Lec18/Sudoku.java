package Lec18;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Sudoku_Solver(arr, 0, 0);
	}

	public static void Sudoku_Solver(int[][] arr, int row, int col) {

		if (col == 9) {
			row++;
			col = 0;
		}
		if(row==9) {
			Display(arr);
			return;
		}
		
		if (arr[row][col] != 0) {
			Sudoku_Solver(arr, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {

				if (is_Safe(arr, row, col, val)) {
					arr[row][col] = val;
					Sudoku_Solver(arr, row, col + 1);
					arr[row][col] = 0;
				}
			}

		}
	}
	private static boolean is_Safe(int[][] arr, int row, int col,
			int val) {
		// TODO Auto-generated method stub
		// Vertical
		int r =0;
		while(r<9) {
			if(arr[r][col]==val) {
				return false;
			}
			r++;
		}
		// HOri
		int c=0;
		while(c<9) {
			if(arr[row][c]==val) {
				return false;
			}
			c++;
		}
		// 3*3 Matrix
		 r = row-row%3;
		 c=col-col%3;
		 for (int i = r; i < r+3; i++) {
			for(int j=c; j<c+3; j++) {
				if(arr[i][j]==val) {
					return false;
				}
			}
			
		}
		
		
		return true;
	}

	public  static void Display(int [][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

}
}
