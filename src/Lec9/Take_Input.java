package Lec9;

import java.util.Scanner;

public class Take_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
