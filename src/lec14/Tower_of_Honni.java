package lec14;

import java.util.Scanner;

public class Tower_of_Honni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		TOH(n, "T1", "T2", "T3");
		// System.out.println
		System.out.println((int) (Math.pow(2, n) - 1));
	}

	public static void TOH(int n, String T1, String T2, String T3) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		TOH(n - 1, T1, T3, T2);
		System.out.println("Move " + n + "th disc from " + T1 + " to " + T3);
		TOH(n - 1, T2, T1, T3);
	}

}
