package Lec22;

import java.util.Scanner;

public class Vivek_Loves_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Get_points(arr, 0, n-1));

	}
	public static int Get_points(int []arr, int si, int ei) {
		
		for (int mid = si; mid <ei; mid++) {
			
			int sum_l=0;
			int sum_r=0;
			for (int i = si; i <=mid; i++) {
				sum_l+=arr[i];
			}
			for (int i = mid+1; i <=ei; i++) {
				sum_r+=arr[i];
			}
			if(sum_l==sum_r) {
				int left_ans=Get_points(arr, si, mid);
				int right_ans=Get_points(arr, mid+1, ei);
				return Math.max(left_ans, right_ans)+1;
			}
		}
		return 0;
	}

}
