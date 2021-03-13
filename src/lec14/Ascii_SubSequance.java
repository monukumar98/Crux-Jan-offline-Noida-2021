package lec14;

public class Ascii_SubSequance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sub_seq("abc", "");
System.out.println();
System.out.println(sub_seq_count("ab", ""));
	}
	public static void sub_seq(String Ques, String ans) {
		// TODO Auto-generated method stub
		if(Ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = Ques.charAt(0);
		sub_seq(Ques.substring(1), ans + ch);// char
		sub_seq(Ques.substring(1), ans);// No
		sub_seq(Ques.substring(1), ans + (int)(ch));// Ascii

		

	}
	public static int sub_seq_count(String Ques, String ans) {
		// TODO Auto-generated method stub
		if(Ques.length()==0) {
			//System.out.print(ans+" ");
			return 1;
		}
		char ch = Ques.charAt(0);
		int c1 =sub_seq_count(Ques.substring(1), ans + ch);// char
		int c2= sub_seq_count(Ques.substring(1), ans);// No
		int c3 =sub_seq_count(Ques.substring(1), ans + (int)(ch));// Ascii

		return c1+c2+c3;

	}

}
