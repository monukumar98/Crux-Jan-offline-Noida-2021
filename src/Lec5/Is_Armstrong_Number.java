package Lec5;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = count_of_digit(n);
		//System.out.println(count);
		if(Create_Armstrong_Number(count, n)==n) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		

	}

	public static int count_of_digit(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
public static int Create_Armstrong_Number(int cd, int n) {
	int ans =0;
	while(n>0) {
		int rem = n%10;
		ans = (int) (ans + Math.pow(rem, cd));
		n/=10;
		
	}
	return ans;
}
}
