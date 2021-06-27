package Lec40;

public class Unique_Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,2,3,7,7};
		System.out.println(Singlenumber(arr));

	}
	public static int Singlenumber(int []arr) {
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			ans= ans^arr[i];
		}
		return ans;
	}

}
