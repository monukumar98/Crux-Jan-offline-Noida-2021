package Lec13;

import java.util.Arrays;
import java.util.Scanner;

public class Divisible_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Good_Subarray(arr, n));
			t--;
		}

	}

	public static long Good_Subarray(int[] arr, int n) {
		int[] ans = new int[n];
		ans[0] = 1;
		int sum = 0;
		for (int i = 0; i < ans.length; i++) {
			sum = sum + arr[i];
			// -ve sum
			if (sum < 0) {
				sum = sum % n;
				sum = sum + n;
				sum = sum % n;
			} else {
				sum = sum % n;
			}
			ans[sum]++;
		}
		// System.out.println(Arrays.toString(ans));
		long res = 0;
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] >= 2) {
				int p = ans[i];
				res = res + (p * (p - 1)) / 2;

			}
		}
		return res;
	}

}
