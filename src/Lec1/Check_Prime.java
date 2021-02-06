package Lec1;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2);
		System.out.println(5);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				System.out.println("Not prime");
				return;
			}

			i=i+1;
		}

		System.out.println("prime");

	}

}
