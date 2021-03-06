package Lec11;

import java.util.Scanner;

public class Playing_with_Good_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str.length();
		System.out.println(GoodSting(str));
		

	}
	public static int GoodSting(String str) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < str.length(); ) {
			int count=0;
			if(is_vowels(str.charAt(i))) {
			while(i<str.length()) {
				if(is_vowels(str.charAt(i))) {
					count++;
					i++;
				}
				else {
					break;
				}
			}
			}
			ans= Math.max(ans, count);
			i++;
		}
		return ans;
	}
	public static boolean is_vowels(char ch) {
		return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
	}
}
