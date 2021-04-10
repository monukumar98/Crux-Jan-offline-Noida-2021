package Lec20;

public class Power_Log_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(power(2, 5));
	}

	public static int power(int a, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = power(a, n / 2);
		if (n % 2 != 0) {
			return a * ans * ans;
		} else
			return ans * ans;
	}

}
