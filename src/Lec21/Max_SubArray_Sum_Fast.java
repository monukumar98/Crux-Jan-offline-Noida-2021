package Lec21;

public class Max_SubArray_Sum_Fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, -3, -1, -8, -13, -9 };
		System.out.println(max_sum(arr));


	}
	// O(N)
	public static int max_sum(int []arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum=0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum+=arr[i];
			ans=Math.max(ans, curr_sum);
			if(curr_sum<0) {
				curr_sum=0;
			}
		}
		return ans;
	}

}
