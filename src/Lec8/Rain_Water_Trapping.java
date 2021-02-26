package Lec8;

import java.util.Scanner;

public class Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t >0) {
		int n  = sc.nextInt();
		int [] arr = new  int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Rain_Water(arr));
	    t--;
		}
		}

	public  static int Rain_Water(int[] arr) {
		// TODO Auto-generated method stub
		int left [] = new int[arr.length];
		int right[] = new int [arr.length];
		left[0]=arr[0];
		right[right.length-1]=arr[arr.length-1];
		for (int i = 1; i < right.length; i++) {
			left[i]=Math.max(left[i-1],arr[i]);
		}
		for (int i = arr.length-2; i>=0; i--) {
			right[i]=Math.max(right[i+1],arr[i]);
		}
		int ans = 0;
		for (int i = 0; i < right.length; i++) {
			int water= Math.min(left[i], right[i]);
			ans+=(water-arr[i]);
		}
		return ans;
	}

}
