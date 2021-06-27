package Lec40;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =90;
		System.out.println(even(n));
		

	}
	public static boolean even(int n) {
		if((n&1)==1) {
			return false;
		}
		return true;
	}

}
