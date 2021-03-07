package Lec12;

public class Array_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,17,7,9};
		System.out.println(max(arr, 0, Integer.MIN_VALUE));
	}
public static int max(int []arr,int idx, int ans) {
	// Base Case 
	if(idx==arr.length) {
		return ans;
	}
	if(ans<arr[idx]) {
		ans=arr[idx];
		
	}
	return max(arr, idx+1, ans);
	
}
}
