package Lec16;

public class Mapped_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mapped("196", "");
	}

	public static void Mapped(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		String s1 = ques.substring(0, 1);
		int n1 = Integer.parseInt(s1);
		Mapped(ques.substring(1), ans + (char) (64 + n1));
		if (ques.length() >= 2) {
			s1 = ques.substring(0, 2);
			n1 = Integer.parseInt(s1);
			if (n1 <= 26) {
				Mapped(ques.substring(2), ans + (char) (64 + n1));
			}
		}
	}

}
