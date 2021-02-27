package Lec9;

import java.util.Scanner;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col = sc.nextInt();
		int arr[] [] = new int [row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int item = sc.nextInt();
		int r =0;
		int c=arr[0].length-1;
		while(r<arr.length && c>=0) {
			if(arr[r][c]==item) {
				System.out.println(1);
				return;
			}
			else if(arr[r][c]>item) {
				c--;
			}
			else {
				r++;
			}
		}
		System.out.println(0);
		

	}

}
