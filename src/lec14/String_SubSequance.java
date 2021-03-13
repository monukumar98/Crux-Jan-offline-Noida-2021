package lec14;

public class String_SubSequance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub_seq("abc", "");

	}

	public static void sub_seq(String Ques, String ans) {
		// TODO Auto-generated method stub
		if(Ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = Ques.charAt(0);
		sub_seq(Ques.substring(1), ans + ch);// yes
		sub_seq(Ques.substring(1), ans);// No
		

	}

}
