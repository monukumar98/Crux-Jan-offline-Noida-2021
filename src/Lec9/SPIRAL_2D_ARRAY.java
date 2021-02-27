package Lec9;

public class SPIRAL_2D_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//		int [] []arr= {{1,2,3},{6,4,5}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("................");
		Sprial_print(arr);

	}

	public static void Sprial_print(int[][] arr) {
		// TODO Auto-generated method stub
		int min_row = 0;
		int max_row = arr.length - 1;
		int min_col = 0;
		int max_col = arr[0].length - 1;
		int total_count = arr.length * arr[0].length;
		int count = 0;
		while (count < total_count) {
			for (int col = min_col; col <= max_col && count < total_count; col++) {
				System.out.print(arr[min_row][col] + " ");
				count++;

			}
			min_row++;
			for (int row = min_row; row <= max_row && count < total_count; row++) {
				System.out.print(arr[row][max_col] + " ");
				count++;
			}
			max_col--;
			for (int col = max_col; col >= min_col && count < total_count; col--) {
				System.out.print(arr[max_row][col] + " ");
				count++;
			}
			max_row--;
			for (int row = max_row; row >= min_row && count < total_count; row--) {
				System.out.print(arr[row][min_col] + " ");
				count++;
			}
			min_col++;

		}

	}

}
