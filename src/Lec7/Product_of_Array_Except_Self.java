package Lec7;

import java.util.Arrays;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,4,2,6};
		int [] ans =ProductofArrayExceptSelf(arr);
		System.out.println(Arrays.toString(ans));

	}
	public static int [] ProductofArrayExceptSelf(int [] arr) {
		int left [] = new int [arr.length];
		int right[] = new int [arr.length];
		left[0]=1;
		for (int i = 1; i < right.length; i++) {
			left[i]=arr[i-1]*left[i-1];
		}
		right[right.length-1]=1;
		for (int i = right.length-2; i >=0; i--) {
			right[i]=arr[i+1]*right[i+1];
		}
		for (int i = 0; i < right.length; i++) {
			left[i]=left[i]*right[i];
		}
		return left;
	}

}
