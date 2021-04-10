package Lec20;

public class Max_Sub_Array_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -1, 8, -13, 9 };
		System.out.println(max_sum(arr));
		System.out.println(max_sum1(arr));
	}

	// O(N^3)
	public static int max_sum(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
//					System.out.print(arr[k] + " ");
					sum += arr[k];
				}
//				System.out.println();
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}
// O(n^2)
	public static int max_sum1(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				sum += arr[j];

				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}
}
