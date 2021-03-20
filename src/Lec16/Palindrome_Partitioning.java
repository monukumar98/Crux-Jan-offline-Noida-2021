package Lec16;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePartitioning("nitin", "");

	}

	public static void PalindromePartitioning(String Ques, String ans) {
		// Base Case
		if (Ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= Ques.length(); i++) {
			String ros = Ques.substring(i);
			String part = Ques.substring(0, i);
			if (is_palindrome(part)) {
				PalindromePartitioning(ros, ans + part + " ");
			}
		}
	}

	public static boolean is_palindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
