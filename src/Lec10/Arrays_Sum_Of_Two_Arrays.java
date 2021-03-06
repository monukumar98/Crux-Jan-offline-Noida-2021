package Lec10;

import java.util.ArrayList;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr []= {1,0,2,9};
		int arr1[]= {3,4,5,6,7};
		ArrayList<Integer> list = new ArrayList<>();
		int i=arr.length-1;
		int j = arr1.length-1;
		int carry=0;
		while(i>=0 || j>=0) {
			int sum=carry;
			if(i>=0) {
			sum+=arr[i];
			i--;
			}
			if(j>=0) {
				sum+=arr1[j];
				j--;
			}
			list.add(0,sum%10);
			carry=sum/10;
		}
		if(carry!=0) {
			list.add(0,carry);	
		}
		System.out.println(list);

	}

}
