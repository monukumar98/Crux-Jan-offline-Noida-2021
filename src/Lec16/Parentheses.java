package Lec16;

import java.util.Collections;

public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
generateParenthesis(2, 0, 0, "");
	}
	public static void generateParenthesis(int n,int opening, int closing,String ans) {
	if(opening==n && closing==n) {
		System.out.println(ans);
		return;
	}
	if(closing<opening) {
		generateParenthesis(n, opening, closing+1, ans+")");
	}	
	if(opening<n) {
		generateParenthesis(n, opening+1, closing,ans+"(");
	}
	
	}

}
