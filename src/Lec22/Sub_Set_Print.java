package Lec22;

import java.util.Scanner;

public class Sub_Set_Print {

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
			if (is_sum_zero(arr, 0, 0, false)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
		t--;
	}

	public static void print_subset(int[] arr, int i, String ans) {
		// TODO Auto-generated method stub
		if (i == arr.length) {
			System.out.println(ans);
			return;
		}
		print_subset(arr, i + 1, ans + arr[i] + " ");
		print_subset(arr, i + 1, ans);

	}

	public static boolean is_sum_zero(int[] arr, int i, int ans, boolean flag) {
		if (i == arr.length) {
			if (ans == 0 && flag) {
				return true;
			}
			return false;
		}
		boolean inc = is_sum_zero(arr, i + 1, ans + arr[i], true);
		boolean ex = is_sum_zero(arr, i + 1, ans, flag);// true
		return inc || ex;
	}

	public static void Split_aaray(int[] arr, int i, String ans1, String ans2, int sum1, int sum2) {
		// TODO Auto-generated method stub
		if (i == arr.length) {
			System.out.println(ans1);
			return;
		}
		Split_aaray(arr, i + 1, ans1 + arr[i] + " ", ans2, sum1 + arr[i], sum2);
		Split_aaray(arr, i + 1, ans1, ans2 + arr[i] + " ", sum1, sum2 + arr[i]);

	}

}
