package Lec12;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,7,9};
     print(arr, arr.length-1);
	}
	public  static void print(int []arr, int idx) {
		// Base Case
		if(idx<0) {
			return;
		}
		System.out.print(arr[idx]+" ");
		print(arr, idx-1);
	}
	

}
