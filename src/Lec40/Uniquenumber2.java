package Lec40;

public class Uniquenumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 3, 5, 7 };
		UniqueNumber(arr);

	}

	public static void UniqueNumber(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}
		int mask = ans & (~(ans - 1));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) > 0) {
				a ^= arr[i];
			}
		}
		int b = ans ^ a;
		System.out.println(a + " " + b);
	}

}
