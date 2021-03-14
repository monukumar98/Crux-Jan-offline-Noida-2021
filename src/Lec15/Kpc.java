package Lec15;

public class Kpc {
	   static String [] getchar = {"abc","def", "ghi" ,"jkl" , "mno" , "pqrs" , "tuv" , "wx" , "yz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		key_paid("12","");

	}

	public static void key_paid(String Ques, String ans) {
		// TODO Auto-generated method stub
		// Base Case
		if(Ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch = Ques.charAt(0);
		String get = getchar[ch-49];
		for (int  i= 0;  i< get.length(); i++) {
		key_paid(Ques.substring(1), ans+get.charAt(i));
			
		}
		
		
	}

}
