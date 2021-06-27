package Lec40;

public class Check_ithbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 345;
		System.out.println(check_bit(n, 4));
	}

	public static boolean check_bit(int n, int i) {

		int mask = (1 << (i - 1));// 1000
		return (mask & n) > 0;
	}

}
