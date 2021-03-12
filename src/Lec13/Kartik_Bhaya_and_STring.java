package Lec13;

import java.util.Scanner;

public class Kartik_Bhaya_and_STring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();
		int flip_a = Flip_char(str, k, 'a');
		int flip_b = Flip_char(str, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));

	}

	public static int Flip_char(String str, int k, char ch) {
		// TODO Auto-generated method stub
		int ans = 0;
		int i = 0;
		int j = 0;
		int flip=0;
		while(j<str.length()) {
			if(str.charAt(j)==ch) {
				flip++;
			}
			
			while(flip>k) {
				if(str.charAt(i)==ch) {
					flip--;
				}
				i++;
			}
			ans = Math.max(ans, j-i+1);
			j++;
		}
		return ans;
	}

}
