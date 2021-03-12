package Lec13;

import java.util.Scanner;

public class From_Biggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			form_biggestnumber(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			t--;
		}
	}

	public static void form_biggestnumber(int[] arr) {
		for (int pass = 1; pass < arr.length; pass++) {
			for (int i = 0; i <=arr.length - pass - 1; i++) {
				if (isposible(arr[i], arr[i + 1])) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		}
	}

	private static boolean isposible(int n1, int n2) {
		// TODO Auto-generated method stub

		// n2n1>n1n2
		String s1 = "" + n1;
		String s2 = "" + n2;
		long n1n2 = Long.parseLong(s1 + s2);// n1n2
		long n2n1 = Long.parseLong(s2 + s1);// n2n1
		if (n2n1 > n1n2) {
			return true;
		}
		return false;
	}

}
