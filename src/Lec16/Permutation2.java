package Lec16;

public class Permutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abc", "");
		System.out.println("....................");
		tricky_permutation("abba", "");

	}

	public static void permutation(String Ques, String ans) {
		if (Ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < Ques.length(); i++) {
			String ros = Ques.substring(0, i) + Ques.substring(i + 1);
			permutation(ros, ans + Ques.charAt(i));
		}

	}

	public static void tricky_permutation(String Ques, String ans) {
		if (Ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < Ques.length(); i++) {
			boolean flag = true;
			for (int j = i + 1; j < Ques.length(); j++) {
				if (Ques.charAt(i) == Ques.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				String ros = Ques.substring(0, i) + Ques.substring(i + 1);

				tricky_permutation(ros, ans + Ques.charAt(i));
			}
		}

	}
}
